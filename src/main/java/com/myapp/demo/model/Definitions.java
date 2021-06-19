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
@Table(name = "MRDEF",
    indexes = {
        @Index(name = "X_MRDEF_CUI", columnList = "CUI"),
        @Index(name = "X_MRDEF_AUI", columnList = "AUI"),
        @Index(name = "X_MRDEF_SAB", columnList = "SAB")
    })
public class Definitions implements Serializable {

  //concept unique identifier
  @Column(name = "CUI", nullable = false)
  String cui;

  //atom unique identifier
  @Column(name = "AUI", nullable = false)
  String aui;

  //Unique identifier for attribute
  @Id
  @Column(name = "ATUI", nullable = false)
  String atui;

  //Source asserted attribute identifier
  @Column(name = "SATUI", nullable = true)
  String satui;

  //Source abbreviation - source is the source vocab - full list is in https://www.nlm.nih.gov/research/umls/knowledge_sources/metathesaurus/release/precedence_suppressibility.html
  @Column(name = "SAB", nullable = false)
  String sab;

  //definition
  @Column(name = "DEF", nullable = false)
  String def;

  //N - not suppressed, others - O, E, Y are suppressed
  @Column(name="SUPPRESS", nullable = false)
  String suppress;

  @Column(name="CVF", nullable = true)
  Integer cvf;
}
