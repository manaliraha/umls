package com.myapp.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "MRDEF",
    indexes = {
        @Index(name = "X_MRDEF_CUI", columnList = "CUI"),
        @Index(name = "X_MRDEF_AUI", columnList = "AUI"),
        @Index(name = "X_MRDEF_SAB", columnList = "SAB")
    })
public class Definitions implements Serializable {

  @Column(name = "CUI", nullable = false)
  String cui;

  @Column(name = "AUI", nullable = false)
  String aui;

  @Id
  @Column(name = "ATUI", nullable = false)
  String atui;

  @Column(name = "SATUI", nullable = true)
  String satui;

  @Column(name = "SAB", nullable = false)
  String sab;

  @Column(name = "DEF", nullable = false)
  String def;

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

  public String getAui() {
    return aui;
  }

  public void setAui(String aui) {
    this.aui = aui;
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

  public String getSab() {
    return sab;
  }

  public void setSab(String sab) {
    this.sab = sab;
  }

  public String getDef() {
    return def;
  }

  public void setDef(String def) {
    this.def = def;
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
