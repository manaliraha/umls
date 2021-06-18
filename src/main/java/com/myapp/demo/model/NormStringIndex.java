package com.myapp.demo.model;

import com.myapp.demo.embed.NormStringIndexEmbeddable;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "MRXNS_ENG",
    indexes = {
        @Index(name = "X_MRXNS_ENG_NSTR", columnList = "NSTR")
    })
public class NormStringIndex implements Serializable {

  @EmbeddedId
  NormStringIndexEmbeddable id;

  @Transient
  public NormStringIndexEmbeddable getId() {
    return id;
  }

  @Transient
  public void setId(NormStringIndexEmbeddable id) {
    this.id = id;
  }
}
