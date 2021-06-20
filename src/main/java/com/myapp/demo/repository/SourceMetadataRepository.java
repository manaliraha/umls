package com.myapp.demo.repository;

import com.myapp.demo.model.SourceMetadata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceMetadataRepository extends JpaRepository<SourceMetadata, String> {

}
