package com.niklas.business.sessions.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author niklas.allberg
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class OneSession {

  private String name;

  public OneSession() {
  }

  public OneSession(String name) {
    this.name = name;
  }

}
