package com.myapp.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MRHIER",
    indexes = {
        @Index(name = "X_MRHIER_CUI", columnList = "CUI"),
        @Index(name = "X_MRHIER_AUI", columnList = "AUI"),
        @Index(name = "X_MRHIER_SAB", columnList = "SAB"),
        @Index(name = "X_MRHIER_PTR", columnList = "PTR"),
        @Index(name = "X_MRHIER_PAUI", columnList = "PAUI")
    })
@IdClass(HierarchyId.class)
public class Hierarchy implements Serializable {

  //concept unique identifier
  @Column(name = "CUI", nullable = false)
  String cui;

  //atom unique identifier
  @Id
  @Column(name = "AUI", nullable = false)
  String aui;

  //The context number if the atom has multiple contexts
  @Id
  @Column(name = "CXN", nullable = false)
  String cxn;

  //Unique identifier for parent atom
  @Column(name = "PAUI", nullable = true)
  String paui;

  //Source abbreviation - source is the source vocab - full list is in https://www.nlm.nih.gov/research/umls/knowledge_sources/metathesaurus/release/precedence_suppressibility.html
  @Column(name = "SAB", nullable = false)
  String sab;

  //Additional relationship label
  @Column(name = "RELA", nullable = true)
  String rela;

  //Path to root - dot separated AUIs - like A0398286.A1207394.A0014750.A1207399
  @Column(name = "PTR", nullable = true)
  String ptr;

  //Source asserted hierarchical number or code of context member (if it exists)
  @Column(name = "HCD", nullable = true)
  String hcd;

  @Column(name = "CVF", nullable = true)
  Integer cvf;
}
