package com.myapp.demo.embed;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class WordIndexEmbeddable implements Serializable {

  @Column(name = "LAT", nullable = false)
  String lat;

  @Column(name = "WD", nullable = false)
  String wd;

  @Column(name = "CUI", nullable = false)
  String cui;

  @Column(name = "LUI", nullable = false)
  String lui;

  @Column(name = "SUI", nullable = false)
  String sui;
}
