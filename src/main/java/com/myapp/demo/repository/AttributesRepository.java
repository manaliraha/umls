package com.myapp.demo.repository;

import com.myapp.demo.model.Attributes;
import java.util.List;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AttributesRepository extends JpaRepository<Attributes, String> {

  @Query(value = "select m from Attributes m where m.cui=?1 and m.stype = 'CUI'")
  List<Attributes> findForCui(String cui);

  @Query(value = "select m from Attributes m where m.cui=(:cuiParam) and m.stype = 'CUI' and m.sab IN (:sabs)")
  List<Attributes> findForCuiAndSabs(@Param("cuiParam") String cui, @Param("sabs") Set<String> sabs);
}
