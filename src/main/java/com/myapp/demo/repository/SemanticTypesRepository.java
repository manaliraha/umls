package com.myapp.demo.repository;

import com.myapp.demo.model.SemanticTypes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemanticTypesRepository extends JpaRepository<SemanticTypes, String> {

  List<SemanticTypes> findByCui(String cui);
}
