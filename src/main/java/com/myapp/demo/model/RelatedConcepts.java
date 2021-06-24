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
@Table(name = "MRREL",
    indexes = {
        @Index(name = "X_MRREL_CUI1", columnList = "CUI1"),
        @Index(name = "X_MRREL_AUI1", columnList = "AUI1"),
        @Index(name = "X_MRREL_CUI2", columnList = "CUI2"),
        @Index(name = "X_MRREL_AUI2", columnList = "AUI2"),
        @Index(name = "X_MRREL_SAB", columnList = "SAB")
    })
public class RelatedConcepts implements Serializable {

  //Unique identifier for first concept
  @Column(name = "CUI1", nullable = false)
  String cui1;

  //Unique identifier for first atom
  @Column(name = "AUI1", nullable = true)
  String aui1;

  //identifier to which relation is attached - can be AUI, AUI, CODE, RUI, SCUI or SDUI (MRDOC)
  @Column(name = "STYPE1", nullable = false)
  String stype1;

  //Relationship label
  //All possible values are in MRDOC
  @Column(name = "REL", nullable = false)
  String rel;

  //Unique identifier for second concept
  @Column(name = "CUI2", nullable = false)
  String cui2;

  //Unique identifier for second atom
  @Column(name = "AUI2", nullable = true)
  String aui2;

  //identifier to which relation is attached - can be AUI, AUI, CODE, RUI, SCUI or SDUI (MRDOC)
  @Column(name = "STYPE2", nullable = false)
  String stype2;

  //Additional Relationship label
  //relationship attribute - all possible values are in MRDOC
  @Column(name = "RELA", nullable = true)
  String rela;

  //Relation identifier
  @Id
  @Column(name = "RUI", nullable = false)
  String rui;

  //Source attributed relationship identifier
  @Column(name = "SRUI", nullable = true)
  String srui;

  @Column(name = "SAB", nullable = false)
  String sab;

  //Source of relationship labels
  @Column(name = "SL", nullable = false)
  String sl;

  //Relationship group
  @Column(name = "RG", nullable = true)
  String rg;

  @Column(name = "DIR", nullable = true)
  String dir;

  @Column(name="SUPPRESS", nullable = false)
  String suppress;

  //Content view flag
  @Column(name="CVF", nullable = true)
  Integer CVF;

}
