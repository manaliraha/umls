package com.myapp.demo.repository;

import com.myapp.demo.model.NormStringIndex;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface NormStringIndexRepository extends CrudRepository<NormStringIndex, String>  {

  //no index on cui - slow query
  public List<NormStringIndex> findByIdCui(String cui);

  public List<NormStringIndex> findByIdNstr(String nstr);
}
