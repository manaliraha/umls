package com.myapp.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "MRSTY",
    indexes = {
        @Index(name = "X_MRSTY_CUI", columnList = "CUI"),
        @Index(name = "X_MRSTY_STY", columnList = "STY")
    })
public class SemanticTypes implements Serializable {

  @Column(name = "CUI", nullable = false)
  String cui;

  @Column(name = "TUI", nullable = false)
  String tui;

  @Column(name = "STN", nullable = false)
  String stn;

  @Column(name = "STY", nullable = false)
  String sty;

  @Id
  @Column(name = "ATUI", nullable = false)
  String atui;

  @Column(name="CVF", nullable = true)
  Integer cvf;

  public String getCui() {
    return cui;
  }

  public void setCui(String cui) {
    this.cui = cui;
  }

  public String getTui() {
    return tui;
  }

  public void setTui(String tui) {
    this.tui = tui;
  }

  public String getStn() {
    return stn;
  }

  public void setStn(String stn) {
    this.stn = stn;
  }

  public String getSty() {
    return sty;
  }

  public void setSty(String sty) {
    this.sty = sty;
  }

  public String getAtui() {
    return atui;
  }

  public void setAtui(String atui) {
    this.atui = atui;
  }

  public Integer getCvf() {
    return cvf;
  }

  public void setCvf(Integer cvf) {
    this.cvf = cvf;
  }
}
