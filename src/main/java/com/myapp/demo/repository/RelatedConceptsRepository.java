package com.myapp.demo.repository;

import com.myapp.demo.interfaces.ConceptsOnly;
import com.myapp.demo.model.RelatedConcepts;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RelatedConceptsRepository extends JpaRepository<RelatedConcepts, String> {

  @Query(value = "select m.cui1 as cui1, m.cui2 as cui2 from RelatedConcepts m where m.stype1='CUI' and m.cui2=?1")
  List<ConceptsOnly> findRelatedConcepts(String cui);

  @Query(value = "select m from RelatedConcepts m where m.stype1='CUI' and m.cui2=?1")
  List<RelatedConcepts> findInverseRelatedConcepts(String cui);

  List<RelatedConcepts> findByCui1(String cui1);

  <T> List<T> findByCui1(String cui1, Class<T> type);

  @Query(value = "select m.cui1 as cui1, m.cui2 as cui2, n.str as str from RelatedConcepts m, ConceptNames n where m.cui1=?1 and m.stype1='CUI' and m.cui2=n.cui and n.ts='P' AND n.stt = 'PF' and n.isPref = 'Y' and n.lat = 'ENG'")
  List<ConceptsOnly> findPreferredEnglishNameForOutgoingRelationships(String cui1);

  @Query(value = "select m.cui1 as cui1, m.cui2 as cui2, n.str as str from RelatedConcepts m, ConceptNames n where m.cui2=?1 and m.stype2='CUI' and m.cui1=n.cui and n.ts='P' AND n.stt = 'PF' and n.isPref = 'Y' and n.lat = 'ENG'")
  List<ConceptsOnly> findPreferredEnglishNameForIncomingRelationships(String cui2);
}
