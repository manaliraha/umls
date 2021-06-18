package com.myapp.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "MRSAB",
    indexes = {
        @Index(name = "X_MRSAB_RSAB", columnList = "RSAB")
    })
public class SourceMetadata implements Serializable {

  @Column(name = "VCUI", nullable = true)
  String vcui;

  @Column(name = "RCUI", nullable = true)
  String rcui;

  @Id
  @Column(name = "VSAB", nullable = false)
  String vsab;

  @Column(name = "RSAB", nullable = false)
  String rsab;

  @Column(name = "SON", nullable = false)
  String son;

  @Column(name = "SF", nullable = false)
  String sf;

  @Column(name = "SVER", nullable = true)
  String sver;

  @Column(name = "VSTART", nullable = true)
  String vstart;

  @Column(name = "VEND", nullable = true)
  String vend;

  @Column(name = "IMETA", nullable = false)
  String imeta;

  @Column(name = "RMETA", nullable = true)
  String rmeta;

  @Column(name = "SLC", nullable = true)
  String slc;

  @Column(name = "SCC", nullable = true)
  String scc;

  @Column(name = "SRL", nullable = false)
  Integer srl;

  @Column(name = "TFR", nullable = true)
  Integer tfr;

  @Column(name = "CFR", nullable = true)
  Integer cfr;

  @Column(name = "CXTY", nullable = true)
  String cxty;

  @Column(name = "TTYL", nullable = true)
  String ttyl;

  @Column(name = "ATNL", nullable = true)
  String atnl;

  @Column(name = "LAT", nullable = true)
  String lat;

  @Column(name = "CENC", nullable = false)
  String cenc;

  @Column(name = "CURVER", nullable = false)
  String curver;

  @Column(name = "SABIN", nullable = false)
  String sabin;

  @Column(name = "SSN", nullable = false)
  String ssn;

  @Column(name = "SCIT", nullable = false)
  String scit;

  public String getVcui() {
    return vcui;
  }

  public void setVcui(String vcui) {
    this.vcui = vcui;
  }

  public String getRcui() {
    return rcui;
  }

  public void setRcui(String rcui) {
    this.rcui = rcui;
  }

  public String getVsab() {
    return vsab;
  }

  public void setVsab(String vsab) {
    this.vsab = vsab;
  }

  public String getRsab() {
    return rsab;
  }

  public void setRsab(String rsab) {
    this.rsab = rsab;
  }

  public String getSon() {
    return son;
  }

  public void setSon(String son) {
    this.son = son;
  }

  public String getSf() {
    return sf;
  }

  public void setSf(String sf) {
    this.sf = sf;
  }

  public String getSver() {
    return sver;
  }

  public void setSver(String sver) {
    this.sver = sver;
  }

  public String getVstart() {
    return vstart;
  }

  public void setVstart(String vstart) {
    this.vstart = vstart;
  }

  public String getVend() {
    return vend;
  }

  public void setVend(String vend) {
    this.vend = vend;
  }

  public String getImeta() {
    return imeta;
  }

  public void setImeta(String imeta) {
    this.imeta = imeta;
  }

  public String getRmeta() {
    return rmeta;
  }

  public void setRmeta(String rmeta) {
    this.rmeta = rmeta;
  }

  public String getSlc() {
    return slc;
  }

  public void setSlc(String slc) {
    this.slc = slc;
  }

  public String getScc() {
    return scc;
  }

  public void setScc(String scc) {
    this.scc = scc;
  }

  public Integer getSrl() {
    return srl;
  }

  public void setSrl(Integer srl) {
    this.srl = srl;
  }

  public Integer getTfr() {
    return tfr;
  }

  public void setTfr(Integer tfr) {
    this.tfr = tfr;
  }

  public Integer getCfr() {
    return cfr;
  }

  public void setCfr(Integer cfr) {
    this.cfr = cfr;
  }

  public String getCxty() {
    return cxty;
  }

  public void setCxty(String cxty) {
    this.cxty = cxty;
  }

  public String getTtyl() {
    return ttyl;
  }

  public void setTtyl(String ttyl) {
    this.ttyl = ttyl;
  }

  public String getAtnl() {
    return atnl;
  }

  public void setAtnl(String atnl) {
    this.atnl = atnl;
  }

  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getCenc() {
    return cenc;
  }

  public void setCenc(String cenc) {
    this.cenc = cenc;
  }

  public String getCurver() {
    return curver;
  }

  public void setCurver(String curver) {
    this.curver = curver;
  }

  public String getSabin() {
    return sabin;
  }

  public void setSabin(String sabin) {
    this.sabin = sabin;
  }

  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public String getScit() {
    return scit;
  }

  public void setScit(String scit) {
    this.scit = scit;
  }

}
