package com.myapp.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "MRHIER",
    indexes = {
        @Index(name = "X_MRHIER_CUI", columnList = "CUI"),
        @Index(name = "X_MRHIER_AUI", columnList = "AUI"),
        @Index(name = "X_MRHIER_SAB", columnList = "SAB"),
        @Index(name = "X_MRHIER_PTR", columnList = "PTR"),
        @Index(name = "X_MRHIER_PAUI", columnList = "PAUI")
    })
@IdClass(HierarchyId.class)
public class Hierarchy implements Serializable {

  @Column(name = "CUI", nullable = false)
  String cui;

  @Id
  @Column(name = "AUI", nullable = false)
  String aui;

  @Id
  @Column(name = "CXN", nullable = false)
  String cxn;

  @Column(name = "PAUI", nullable = true)
  String paui;

  @Column(name = "SAB", nullable = false)
  String sab;

  @Column(name = "RELA", nullable = true)
  String rela;

  @Column(name = "PTR", nullable = true)
  String ptr;

  @Column(name = "HCD", nullable = true)
  String hcd;

  @Column(name = "CVF", nullable = true)
  Integer cvf;

  public String getCui() {
    return cui;
  }

  public void setCui(String cui) {
    this.cui = cui;
  }

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

  public String getPaui() {
    return paui;
  }

  public void setPaui(String paui) {
    this.paui = paui;
  }

  public String getSab() {
    return sab;
  }

  public void setSab(String sab) {
    this.sab = sab;
  }

  public String getRela() {
    return rela;
  }

  public void setRela(String rela) {
    this.rela = rela;
  }

  public String getPtr() {
    return ptr;
  }

  public void setPtr(String ptr) {
    this.ptr = ptr;
  }

  public String getHcd() {
    return hcd;
  }

  public void setHcd(String hcd) {
    this.hcd = hcd;
  }

  public Integer getCvf() {
    return cvf;
  }

  public void setCvf(Integer cvf) {
    this.cvf = cvf;
  }
}
