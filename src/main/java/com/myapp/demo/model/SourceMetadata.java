package com.myapp.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

}
