package com.myapp.demo.repository;

import com.myapp.demo.model.Definitions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefinitionsRepository extends JpaRepository<Definitions, String> {

}
