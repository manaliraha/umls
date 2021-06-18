package com.myapp.demo.api;

import com.myapp.demo.interfaces.ConceptsOnly;
import com.myapp.demo.model.ConceptNames;
import com.myapp.demo.model.Hierarchy;
import com.myapp.demo.model.NormStringIndex;
import com.myapp.demo.model.RelatedConcepts;
import com.myapp.demo.repository.ConceptNamesRepository;
import com.myapp.demo.repository.HierarchyRepository;
import com.myapp.demo.repository.NormStringIndexRepository;
import com.myapp.demo.repository.RelatedConceptsRepository;
import java.util.List;
import java.util.Optional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Path("/ping")
public class Ping {

  @Autowired
  private ConceptNamesRepository conceptNamesRepository;

  @Autowired
  private RelatedConceptsRepository relatedConceptsRepository;

  @Autowired
  private HierarchyRepository hierarchyRepository;

  @Autowired
  private NormStringIndexRepository normStringIndexRepository;

  @GET
  public Response ping() {
    Optional<ConceptNames> item = conceptNamesRepository.findById("A9333108");
    ConceptNames itemExists = item.isPresent() ? item.get() : null;
    String entity = itemExists == null ? "all cool" : itemExists.toString();

    List<ConceptNames> items = conceptNamesRepository.findAllMrconso("anemia", "A14148612");
    for (ConceptNames item1 : items) {
      log.info("conceptNames object sab: {}, cui: {}", item1.getSab(), item1.getCui());
    }

    String cui = itemExists.getCui();
    List<ConceptsOnly> output = relatedConceptsRepository.findRelatedConcepts(cui);
    for (ConceptsOnly con : output) {
      log.info("conceptsOnly object cui1: {}, cui2: {}", con.getCui1(), con.getCui2());
    }

    List<RelatedConcepts> output3 = relatedConceptsRepository.findByCui1(cui);
    for (RelatedConcepts chik : output3) {
      log.info("RelatedConcepts object cui1: {}, cui2: {}, rg: {}, aui1: {}, aui2: {}", chik.getCui1(), chik.getCui2(),
          chik.getRg(), chik.getAui1(), chik.getAui2());
    }

    List<ConceptsOnly> output4 = relatedConceptsRepository.findByCui1(cui, ConceptsOnly.class);
    for (ConceptsOnly con : output4) {
      log.info("conceptsOnly object cui1: {}, cui2: {}", con.getCui1(), con.getCui2());
    }

    List<Hierarchy> output5 = hierarchyRepository.findByCui(cui);
    for (Hierarchy hier : output5) {
      log.info("hierarchy object aui: {}, cvf: {}, rela: {}, sab: {}, ptr: {}", hier.getAui(), hier.getCvf(),
          hier.getRela(), hier.getSab(), hier.getPtr());
    }

    List<NormStringIndex> output6 = normStringIndexRepository.findByIdNstr("abnormal bleed");
    for (NormStringIndex tik : output6) {
      log.info("normStringIndex object lui: {}, cui: {}, sui: {}", tik.getId().getLui(), tik.getId().getCui(),
          tik.getId().getSui());
    }

    return Response.status(Response.Status.OK).entity(entity).build();
  }
}
