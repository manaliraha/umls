package com.myapp.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "MRCONSO",
indexes = {
    @Index(name = "X_MRCONSO_CUI", columnList = "CUI"),
    @Index(name = "X_MRCONSO_SUI", columnList = "SUI"),
    @Index(name = "X_MRCONSO_LUI", columnList = "LUI"),
    @Index(name = "X_MRCONSO_CODE", columnList = "CODE"),
    @Index(name = "X_MRCONSO_SAB_TTY", columnList = "SAB, TTY"),
    @Index(name = "X_MRCONSO_SCUI", columnList = "SCUI"),
    @Index(name = "X_MRCONSO_SDUI", columnList = "SDUI"),
    @Index(name = "X_MRCONSO_STR", columnList = "STR")
})
public class ConceptNames implements Serializable {

  @Column(name="CUI", nullable = false)
  String cui;

  @Column(name="LAT", nullable = false)
  String lat;

  @Column(name="TS", nullable = false)
  String ts;

  @Column(name="LUI", nullable = false)
  String lui;

  @Column(name="STT", nullable = false)
  String stt;

  @Column(name="SUI", nullable = false)
  String sui;

  @Column(name="ISPREF", nullable = false)
  String isPref;

  @Id
  @Column(name="AUI", nullable = false)
  String aui;

  @Column(name="SAUI", nullable = true)
  String saui;

  @Column(name="SCUI", nullable = true)
  String scui;

  @Column(name="SDUI", nullable = true)
  String sdui;

  @Column(name="SAB", nullable = false)
  String sab;

  @Column(name="TTY", nullable = false)
  String tty;

  @Column(name="CODE", nullable = false)
  String code;

  @Column(name="STR", nullable = false)
  String str;

  @Column(name="SRL", nullable = false)
  Integer srl;

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

  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getTs() {
    return ts;
  }

  public void setTs(String ts) {
    this.ts = ts;
  }

  public String getLui() {
    return lui;
  }

  public void setLui(String lui) {
    this.lui = lui;
  }

  public String getStt() {
    return stt;
  }

  public void setStt(String stt) {
    this.stt = stt;
  }

  public String getSui() {
    return sui;
  }

  public void setSui(String sui) {
    this.sui = sui;
  }

  public String getIsPref() {
    return isPref;
  }

  public void setIsPref(String isPref) {
    this.isPref = isPref;
  }

  public String getAui() {
    return aui;
  }

  public void setAui(String aui) {
    this.aui = aui;
  }

  public String getSaui() {
    return saui;
  }

  public void setSaui(String saui) {
    this.saui = saui;
  }

  public String getScui() {
    return scui;
  }

  public void setScui(String scui) {
    this.scui = scui;
  }

  public String getSdui() {
    return sdui;
  }

  public void setSdui(String sdui) {
    this.sdui = sdui;
  }

  public String getSab() {
    return sab;
  }

  public void setSab(String sab) {
    this.sab = sab;
  }

  public String getTty() {
    return tty;
  }

  public void setTty(String tty) {
    this.tty = tty;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public Integer getSrl() {
    return srl;
  }

  public void setSrl(Integer srl) {
    this.srl = srl;
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
