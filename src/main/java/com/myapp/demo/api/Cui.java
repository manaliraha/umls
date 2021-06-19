package com.myapp.demo.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myapp.demo.interfaces.ConceptsOnly;
import com.myapp.demo.model.Attributes;
import com.myapp.demo.model.ConceptNames;
import com.myapp.demo.model.Definitions;
import com.myapp.demo.model.Hierarchy;
import com.myapp.demo.model.RelatedConcepts;
import com.myapp.demo.model.SemanticTypes;
import com.myapp.demo.repository.AttributesRepository;
import com.myapp.demo.repository.ConceptNamesRepository;
import com.myapp.demo.repository.DefinitionsRepository;
import com.myapp.demo.repository.HierarchyRepository;
import com.myapp.demo.repository.RelatedConceptsRepository;
import com.myapp.demo.repository.SemanticTypesRepository;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Path("/content")
public class Cui {

  @Autowired
  private ConceptNamesRepository conceptNamesRepository;

  @Autowired
  private DefinitionsRepository definitionsRepository;

  @Autowired
  private HierarchyRepository hierarchyRepository;

  @Autowired
  private RelatedConceptsRepository relatedConceptsRepository;

  @Autowired
  private AttributesRepository attributesRepository;

  @Autowired
  private SemanticTypesRepository semanticTypesRepository;

  @Autowired
  private ObjectMapper mapper;

  @Path("/cui/{cuiValue}")
  @GET
  public Response fetchCui(@PathParam("cuiValue") String cui) throws JsonProcessingException {
    List<ConceptNames> conceptNamesList = conceptNamesRepository.findByCuiAndLat(cui, "ENG");
    //fetch atoms from above result - do it for ENG (lat: ENG)
    for (ConceptNames name : conceptNamesList) {
      log.info("associated atom {}", mapper.writeValueAsString(name));
    }

    List<Definitions> definitionsList = definitionsRepository.findByCui(cui);
    //find all source definitions from this result - DEF
    for (Definitions def : definitionsList) {
      log.info("associated definitions {}", mapper.writeValueAsString(def));
    }

    List<Hierarchy> hierarchyList = hierarchyRepository.findByCui(cui);
    //find all source contexts - CXN + AUI
    for (Hierarchy hier : hierarchyList) {
      log.info("associated source contexts {}", mapper.writeValueAsString(hier));
    }

    List<Attributes> attributesList = attributesRepository.findForCui(cui);
    //find all attributes -> its giving attributes with stype as CUI
    for (Attributes attr : attributesList) {
      log.info("associated attributes {}", mapper.writeValueAsString(attr));
    }

    List<SemanticTypes> semanticTypesList = semanticTypesRepository.findByCui(cui);
    //find all semantic types - STY
    for (SemanticTypes s : semanticTypesList) {
      log.info("associated stypes {}", mapper.writeValueAsString(s));
    }

    List<RelatedConcepts> relatedConceptsList = relatedConceptsRepository.findByCui1(cui);
    //find all outgoing relationships

    List<RelatedConcepts> invRelatedConceptsList = relatedConceptsRepository.findInverseRelatedConcepts(cui);
    //find all incoming relationships

    List<ConceptsOnly> englishPreferredNamesOfRelationships = relatedConceptsRepository
        .findAllRelationshipsAndPreferredEnglishNameForCui2(cui);
    for (ConceptsOnly c : englishPreferredNamesOfRelationships) {
      log.info("associated eng pref names {}", mapper.writeValueAsString(c));
    }

    return Response.status(Response.Status.OK).entity("too much info").build();
  }
}
