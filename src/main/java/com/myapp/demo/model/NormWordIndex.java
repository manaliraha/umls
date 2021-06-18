package com.myapp.demo.model;

import com.myapp.demo.embed.NormWordIndexEmbeddable;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "MRXNW_ENG",
    indexes = {
        @Index(name = "X_MRXNW_ENG_NWD", columnList = "NWD")
    })
public class NormWordIndex implements Serializable {
  @EmbeddedId
  NormWordIndexEmbeddable id;

  @Transient
  public NormWordIndexEmbeddable getId() {
    return id;
  }

  @Transient
  public void setId(NormWordIndexEmbeddable id) {
    this.id = id;
  }
}
