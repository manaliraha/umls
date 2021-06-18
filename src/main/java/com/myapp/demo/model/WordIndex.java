package com.myapp.demo.model;

import com.myapp.demo.embed.WordIndexEmbeddable;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "MRXW_ENG",
    indexes = {
        @Index(name = "X_MRXW_ENG_WD", columnList = "WD")
    })
public class WordIndex implements Serializable {

  @EmbeddedId
  WordIndexEmbeddable id;

  @Transient
  public WordIndexEmbeddable getId() {
    return id;
  }

  @Transient
  public void setId(WordIndexEmbeddable id) {
    this.id = id;
  }
}
