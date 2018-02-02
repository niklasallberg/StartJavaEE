/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niklas.presentation;

import com.niklas.business.sessions.boundary.SessionProvider;
import javax.ejb.EJB;
import javax.enterprise.inject.Model;

/**
 * @author niklas.allberg
 */
@Model
public class Index {

  @EJB
  SessionProvider sp;

  public String getSession() {
    String a = "niklas";
    return sp.getSessions();
  }

}
