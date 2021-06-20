package com.myapp.demo.repository;

import com.myapp.demo.model.Hierarchy;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface HierarchyRepository extends CrudRepository<Hierarchy, String> {

  List<Hierarchy> findByCui(String cui);

  List<Hierarchy> findByCuiAndAuiIn(String cui, List<String> auis);
}
