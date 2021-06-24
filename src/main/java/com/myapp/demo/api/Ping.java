package com.myapp.demo.api;

import gov.nih.nlm.nls.lvg.Api.LuiNormApi;
import gov.nih.nlm.nls.lvg.Api.NormApi;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Vector;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.io.File;

@Slf4j
@Component
@Path("/ping")
public class Ping {

  @Path("/lala")
  @GET
  public Response lala() throws Exception {
    String configFile = "lvg/data/config/lvg.properties";
    Hashtable<String, String> properties =
        new Hashtable<String, String>();
    properties.put("LVG_DIR", "lvg/");

    LuiNormApi api = new LuiNormApi(configFile, properties);
    String output = api.Mutate("factorize");
    log.info("output is {}", output);
    api.CleanUp();

    NormApi api1 = new NormApi(configFile, properties);
    Vector<String> output1 = api1.Mutate("left");
    log.info("output1 obtained is {}", output1);
    api1.CleanUp();

    return Response.status(Response.Status.OK).entity(output).build();
  }

  @GET
  @Produces(value = MediaType.APPLICATION_JSON)
  public Response ping() {
    /*Optional<ConceptNames> item = conceptNamesRepository.findById("A9333108");
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

    List<Definitions> output7 = definitionsRepository.someQuery("461751000124109");
    for (Definitions d : output7) {
      log.info("obtd def: {}", d.getDef());
    }

    List<ConceptDefinition> output8 = definitionsRepository.someQuery1("461751000124109");
    for (ConceptDefinition d : output8) {
      log.info("obtd conceptdef def: {}, cui: {}, atui: {}, aui: {}, sab: {}, satui: {}, scui: {}", d.getDef(),
          d.getCui(), d.getAtui(), d.getAui(), d.getSab(), d.getSatui(), d.getScui());
    }*/

    log.info("Ping called");
    return Response.status(Response.Status.OK).entity(new Status(true)).build();
  }

  @AllArgsConstructor
  @Getter
  class Status implements Serializable {
    boolean ok;
  }
}
