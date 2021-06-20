package com.myapp.demo.repository;

import com.myapp.demo.model.ConceptNames;
import java.util.List;
import java.util.Set;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ConceptNamesRepository extends CrudRepository<ConceptNames, String> {

  @Query(value = "SELECT m from ConceptNames m where m.str=?1 and m.aui=?2")
  List<ConceptNames> findAllMrconso(String text, String aui);

  List<ConceptNames> findByCuiAndLatInAndSabIn(String cui, Set<String> lat, Set<String> sabs);

  List<ConceptNames> findByCuiAndSabIn(String cui, List<String> sabs);

  List<ConceptNames> findByCuiAndLatIn(String cui, List<String> lat);

  List<ConceptNames> findByCui(String cui);
}
