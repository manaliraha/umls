package com.myapp.demo.model;

import java.io.Serializable;

public class HierarchyId implements Serializable {
  private String aui;
  private String cxn;

  public String getAui() {
    return aui;
  }

  public void setAui(String aui) {
    this.aui = aui;
  }

  public String getCxn() {
    return cxn;
  }

  public void setCxn(String cxn) {
    this.cxn = cxn;
  }
}
