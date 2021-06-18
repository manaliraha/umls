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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    for(ConceptNames item1: items) {
      //System.out.println("obtained " + item1.toString());
    }

    String cui = itemExists.getCui();
    List<ConceptsOnly> output = relatedConceptsRepository.findRelatedConcepts(cui);
    for(ConceptsOnly con: output) {
      //System.out.println("obtained " + con.getCui1() + ", " + con.getCui2());
    }

    List<RelatedConcepts> output3 = relatedConceptsRepository.findByCui1(cui);
    for(RelatedConcepts chik: output3) {
      //System.out.println("la la " + chik.toString());
    }

    List<ConceptsOnly> output4 = relatedConceptsRepository.findByCui1(cui, ConceptsOnly.class);
    for(ConceptsOnly con: output4) {
      //System.out.println("obtained " + con.getCui1() + ", " + con.getCui2());
    }

    List<Hierarchy> output5 = hierarchyRepository.findByCui(cui);
    for(Hierarchy hier: output5) {
      //System.out.println("ting " + hier.toString());
    }

    List<NormStringIndex> output6 = normStringIndexRepository.findByIdNstr("abnormal bleed");
    for(NormStringIndex tik: output6) {
      System.out.println("ting " + tik.getId().getLui() + ", " + tik.getId().getCui() + ", " + tik.getId().getSui());
    }

    return Response.status(Response.Status.OK).entity(entity).build();
  }
}
