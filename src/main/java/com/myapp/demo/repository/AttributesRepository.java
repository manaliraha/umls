package com.myapp.demo.repository;

import com.myapp.demo.model.Attributes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AttributesRepository extends JpaRepository<Attributes, String> {

  @Query(value = "select m from Attributes m where m.cui=?1 and m.stype = 'CUI'")
  List<Attributes> findForCui(String cui);
}
