package com.myapp.demo.repository;

import com.myapp.demo.model.ConceptNames;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ConceptNamesRepository extends CrudRepository<ConceptNames, String> {

  @Query(value="SELECT m from ConceptNames m where m.str=?1 and m.aui=?2")
  List<ConceptNames> findAllMrconso(String text, String aui);

  List<ConceptNames> findByCuiAndLat(String cui, String lat);
}
