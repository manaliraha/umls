package com.myapp.demo.embed;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NormStringIndexEmbeddable implements Serializable {

  @Column(name = "LAT", nullable = false)
  String lat;

  @Column(name = "NSTR", nullable = false)
  String nstr;

  @Column(name = "CUI", nullable = false)
  String cui;

  @Column(name = "LUI", nullable = false)
  String lui;

  @Column(name = "SUI", nullable = false)
  String sui;

  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getNstr() {
    return nstr;
  }

  public void setNstr(String nstr) {
    this.nstr = nstr;
  }

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
}

