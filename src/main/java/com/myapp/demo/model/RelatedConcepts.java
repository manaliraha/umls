package com.myapp.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "MRREL",
    indexes = {
        @Index(name = "X_MRREL_CUI1", columnList = "CUI1"),
        @Index(name = "X_MRREL_AUI1", columnList = "AUI1"),
        @Index(name = "X_MRREL_CUI2", columnList = "CUI2"),
        @Index(name = "X_MRREL_AUI2", columnList = "AUI2"),
        @Index(name = "X_MRREL_SAB", columnList = "SAB")
    })
public class RelatedConcepts implements Serializable {

  @Column(name = "CUI1", nullable = false)
  String cui1;

  @Column(name = "AUI1", nullable = true)
  String aui1;

  @Column(name = "STYPE1", nullable = false)
  String stype1;

  @Column(name = "REL", nullable = false)
  String rel;

  @Column(name = "CUI2", nullable = false)
  String cui2;

  @Column(name = "AUI2", nullable = true)
  String aui2;

  @Column(name = "STYPE2", nullable = false)
  String stype2;

  @Column(name = "RELA", nullable = true)
  String rela;

  @Id
  @Column(name = "RUI", nullable = false)
  String rui;

  @Column(name = "SRUI", nullable = true)
  String srui;

  @Column(name = "SAB", nullable = false)
  String sab;

  @Column(name = "SL", nullable = false)
  String sl;

  @Column(name = "RG", nullable = true)
  String rg;

  @Column(name = "DIR", nullable = true)
  String dir;

  @Column(name="SUPPRESS", nullable = false)
  String suppress;

  @Column(name="CVF", nullable = true)
  Integer CVF;

  public String getCui1() {
    return cui1;
  }

  public void setCui1(String cui1) {
    this.cui1 = cui1;
  }

  public String getAui1() {
    return aui1;
  }

  public void setAui1(String aui1) {
    this.aui1 = aui1;
  }

  public String getStype1() {
    return stype1;
  }

  public void setStype1(String stype1) {
    this.stype1 = stype1;
  }

  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public String getCui2() {
    return cui2;
  }

  public void setCui2(String cui2) {
    this.cui2 = cui2;
  }

  public String getAui2() {
    return aui2;
  }

  public void setAui2(String aui2) {
    this.aui2 = aui2;
  }

  public String getStype2() {
    return stype2;
  }

  public void setStype2(String stype2) {
    this.stype2 = stype2;
  }

  public String getRela() {
    return rela;
  }

  public void setRela(String rela) {
    this.rela = rela;
  }

  public String getRui() {
    return rui;
  }

  public void setRui(String rui) {
    this.rui = rui;
  }

  public String getSrui() {
    return srui;
  }

  public void setSrui(String srui) {
    this.srui = srui;
  }

  public String getSab() {
    return sab;
  }

  public void setSab(String sab) {
    this.sab = sab;
  }

  public String getSl() {
    return sl;
  }

  public void setSl(String sl) {
    this.sl = sl;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }

  public String getSuppress() {
    return suppress;
  }

  public void setSuppress(String suppress) {
    this.suppress = suppress;
  }

  public Integer getCVF() {
    return CVF;
  }

  public void setCVF(Integer CVF) {
    this.CVF = CVF;
  }

}
