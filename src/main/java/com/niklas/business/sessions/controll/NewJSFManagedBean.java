/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niklas.business.sessions.controll;

import com.niklas.business.sessions.boundary.SessionProvider;
import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

/**
 * @author niklas.allberg
 */
@Named(value = "newJSFManagedBean")
@Dependent
public class NewJSFManagedBean {

  public NewJSFManagedBean() {
  }

  @EJB
  SessionProvider sp;

  public String getSession() {
    return sp.getSessions();
  }

  public String getSavedSession() {
    return sp.getSavedSessions();
  }

  public String archive(String str) {
    System.out.println(str);
    return str;
  }

}
