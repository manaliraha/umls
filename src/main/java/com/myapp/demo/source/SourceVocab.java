package com.myapp.demo.source;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myapp.demo.model.SourceMetadata;
import com.myapp.demo.repository.SourceMetadataRepository;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SourceVocab {

  private final List<SourceMetadata> sourceList;
  private final Set<String> languageSet;
  private final Set<String> sourceVocabSet;

  @Autowired
  SourceVocab(SourceMetadataRepository sourceMetadataRepository, ObjectMapper mapper) throws JsonProcessingException {
    sourceList = sourceMetadataRepository.findAll();
    sourceVocabSet = sourceList.stream().map(x -> x.getRsab()).collect(Collectors.toSet());
    languageSet = sourceList.stream().map(x -> x.getLat()).collect(Collectors.toSet());
    log.info("Initialized source vocab and corresponding language info: LATs: {}, SABs: {}",
        mapper.writeValueAsString(languageSet), mapper.writeValueAsString(sourceVocabSet));
  }

  //contains the RSAB and LAT - referred to as SAB in other tables and the language as well for the source vocab
  //initialized as bean - to be used for validation etc related to SAB and LAT
  @Bean(name = "sourceMetadataList")
  List<SourceMetadata> fetchSabInfo() {
    return sourceList;
  }

  @Bean(name = "languageSet")
  Set<String> fetchLanguageSet() {
    return languageSet;
  }

  @Bean(name = "sourceVocabSet")
  Set<String> fetchSourceVocabSet() {
    return sourceVocabSet;
  }
}
