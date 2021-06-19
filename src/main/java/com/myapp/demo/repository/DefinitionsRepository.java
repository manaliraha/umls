package com.myapp.demo.repository;

import com.myapp.demo.interfaces.ConceptDefinition;
import com.myapp.demo.model.Definitions;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DefinitionsRepository extends JpaRepository<Definitions, String> {

  @Query("select b from Definitions b, ConceptNames c where b.aui = c.aui and c.sab = 'SNOMEDCT_US' and c.scui = ?1")
  List<Definitions> someQuery(String scui);

  @Query("select b.atui as atui, b.aui as aui, b.def as def, b.satui as satui, c.scui as scui, c.sab as sab, c.cui as cui from Definitions b, ConceptNames c where b.aui = c.aui and c.sab = 'SNOMEDCT_US' and c.scui = ?1")
  List<ConceptDefinition> someQuery1(String scui);

  List<Definitions> findByCui(String cui);
}
