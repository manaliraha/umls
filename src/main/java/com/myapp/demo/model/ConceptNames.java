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

  //concept unique identifier
  @Column(name="CUI", nullable = false)
  String cui;

  //language of terms - values are available in https://www.nlm.nih.gov/research/umls/knowledge_sources/metathesaurus/release/abbreviations.html#mrdoc_LAT
  @Column(name="LAT", nullable = false)
  String lat;

  //Term status
  @Column(name="TS", nullable = false)
  String ts;

  //Unique identifier for term
  @Column(name="LUI", nullable = false)
  String lui;

  //string type (PF means preferred term) - full list of values in https://www.nlm.nih.gov/research/umls/knowledge_sources/metathesaurus/release/abbreviations.html#mrdoc_STT
  @Column(name="STT", nullable = false)
  String stt;

  //Unique identifier for string
  @Column(name="SUI", nullable = false)
  String sui;

  //indicates whether the AUI is preferred for the given CUI (multiple AUIs are preferred per CUI)
  //Y/N
  @Column(name="ISPREF", nullable = false)
  String isPref;

  //atom unique identifier
  @Id
  @Column(name="AUI", nullable = false)
  String aui;

  //Source asserted attribute identifier
  @Column(name="SAUI", nullable = true)
  String saui;

  //source asserted concept unique identifier
  @Column(name="SCUI", nullable = true)
  String scui;

  //source asserted descriptor identifier
  @Column(name="SDUI", nullable = true)
  String sdui;

  //Source abbreviation - source is the source vocab - full list is in https://www.nlm.nih.gov/research/umls/knowledge_sources/metathesaurus/release/precedence_suppressibility.html
  @Column(name="SAB", nullable = false)
  String sab;

  //term type in source - full list is in https://www.nlm.nih.gov/research/umls/knowledge_sources/metathesaurus/release/abbreviations.html
  @Column(name="TTY", nullable = false)
  String tty;

  //Unique Identifier or code for string in source
  @Column(name="CODE", nullable = false)
  String code;

  //String
  @Column(name="STR", nullable = false)
  String str;

  //Source Restriction Level
  @Column(name="SRL", nullable = false)
  Integer srl;

  //N - not suppressed, others - O, E, Y are suppressed
  @Column(name="SUPPRESS", nullable = false)
  String suppress;

  @Column(name="CVF", nullable = true)
  Integer cvf;
}
