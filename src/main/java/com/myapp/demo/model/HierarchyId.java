package com.myapp.demo.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HierarchyId implements Serializable {
  private String aui;
  private String cxn;
}
