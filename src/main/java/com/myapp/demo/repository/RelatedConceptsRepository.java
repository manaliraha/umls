package com.myapp.demo.repository;

import com.myapp.demo.interfaces.ConceptsOnly;
import com.myapp.demo.model.RelatedConcepts;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RelatedConceptsRepository extends JpaRepository<RelatedConcepts, String> {

  @Query(value = "select m.cui1 as cui1, m.cui2 as cui2 from RelatedConcepts m where m.stype1='CUI' and m.cui2=?1")
  List<ConceptsOnly> findRelatedConcepts(String cui);

  List<RelatedConcepts> findByCui1(String cui1);

  <T> List<T> findByCui1(String cui1, Class<T> type);
}
