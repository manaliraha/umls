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
@Table(name = "MRSAT",
    indexes = {
        @Index(name = "X_MRSAT_CUI", columnList = "CUI"),
        @Index(name = "X_MRSAT_METAUI", columnList = "METAUI"),
        @Index(name = "X_MRSAT_SAB", columnList = "SAB"),
        @Index(name = "X_MRSAT_ATN", columnList = "ATN")
    })
public class Attributes implements Serializable {

  //concept unique identifier
  @Column(name = "CUI", nullable = false)
  String cui;

  //Unique identifier for term
  @Column(name = "LUI", nullable = true)
  String lui;

  //Unique identifier for string
  @Column(name = "SUI", nullable = true)
  String sui;

  //Metathesaurus asserted unique identifier
  @Column(name = "METAUI", nullable = true)
  String metaui;

  //identifier to which attribute is attached - can be AUI, CODE, RUI, SCUI or SDUI (read from MRDOC)
  @Column(name = "STYPE", nullable = false)
  String stype;

  //Unique Identifier or code for string in source
  @Column(name = "CODE", nullable = true)
  String code;

  //Unique identifier for attribute
  @Id
  @Column(name = "ATUI", nullable = false)
  String atui;

  //Source asserted attribute identifier
  @Column(name = "SATUI", nullable = true)
  String satui;

  //Attribute name - all possible values are in MRDOC
  @Column(name = "ATN", nullable = false)
  String atn;

  //Source abbreviation - source is the source vocab - full list is in MRSAB
  @Column(name = "SAB", nullable = false)
  String sab;

  //Attribute value
  @Column(name = "ATV", nullable = true)
  String atv;

  @Column(name="SUPPRESS", nullable = false)
  String suppress;

  @Column(name="CVF", nullable = true)
  Integer cvf;
}
