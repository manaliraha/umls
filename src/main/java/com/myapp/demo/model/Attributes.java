package com.myapp.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "MRSAT",
    indexes = {
        @Index(name = "X_MRSAT_CUI", columnList = "CUI"),
        @Index(name = "X_MRSAT_METAUI", columnList = "METAUI"),
        @Index(name = "X_MRSAT_SAB", columnList = "SAB"),
        @Index(name = "X_MRSAT_ATN", columnList = "ATN")
    })
public class Attributes implements Serializable {

  @Column(name = "CUI", nullable = false)
  String cui;

  @Column(name = "LUI", nullable = true)
  String lui;

  @Column(name = "SUI", nullable = true)
  String sui;

  @Column(name = "METAUI", nullable = true)
  String metaui;

  @Column(name = "STYPE", nullable = false)
  String stype;

  @Column(name = "CODE", nullable = true)
  String code;

  @Id
  @Column(name = "ATUI", nullable = false)
  String atui;

  @Column(name = "SATUI", nullable = true)
  String satui;

  @Column(name = "ATN", nullable = false)
  String atn;

  @Column(name = "SAB", nullable = false)
  String sab;

  @Column(name = "ATV", nullable = true)
  String atv;

  @Column(name="SUPPRESS", nullable = false)
  String suppress;

  @Column(name="CVF", nullable = true)
  Integer cvf;

  public String getCui() {
    return cui;
  }

  public void setCui(String cui) {
    this.cui = cui;
  }

  public String getLui() {
    return lui;
  }

  public void setLui(String lui) {
    this.lui = lui;
  }

  public String getSui() {
    return sui;
  }

  public void setSui(String sui) {
    this.sui = sui;
  }

  public String getMetaui() {
    return metaui;
  }

  public void setMetaui(String metaui) {
    this.metaui = metaui;
  }

  public String getStype() {
    return stype;
  }

  public void setStype(String stype) {
    this.stype = stype;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getAtui() {
    return atui;
  }

  public void setAtui(String atui) {
    this.atui = atui;
  }

  public String getSatui() {
    return satui;
  }

  public void setSatui(String satui) {
    this.satui = satui;
  }

  public String getAtn() {
    return atn;
  }

  public void setAtn(String atn) {
    this.atn = atn;
  }

  public String getSab() {
    return sab;
  }

  public void setSab(String sab) {
    this.sab = sab;
  }

  public String getAtv() {
    return atv;
  }

  public void setAtv(String atv) {
    this.atv = atv;
  }

  public String getSuppress() {
    return suppress;
  }

  public void setSuppress(String suppress) {
    this.suppress = suppress;
  }

  public Integer getCvf() {
    return cvf;
  }

  public void setCvf(Integer cvf) {
    this.cvf = cvf;
  }
}
