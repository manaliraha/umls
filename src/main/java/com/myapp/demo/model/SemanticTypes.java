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
@Table(name = "MRSTY",
    indexes = {
        @Index(name = "X_MRSTY_CUI", columnList = "CUI"),
        @Index(name = "X_MRSTY_STY", columnList = "STY")
    })
public class SemanticTypes implements Serializable {

  //concept unique identifier
  @Column(name = "CUI", nullable = false)
  String cui;

  //Unique identifier of Semantic type
  @Column(name = "TUI", nullable = false)
  String tui;

  //Semantic type tree number
  @Column(name = "STN", nullable = false)
  String stn;

  //Semantic type - string description
  @Column(name = "STY", nullable = false)
  String sty;

  //just unique identifier - not same as ATUI from Definitions
  @Id
  @Column(name = "ATUI", nullable = false)
  String atui;

  @Column(name="CVF", nullable = true)
  Integer cvf;
}
