package com.niklas.business.sessions.boundary;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author niklas.allberg
 */
@Stateless
@Path("sessions")
public class SessionsResource {

  @EJB
  SessionProvider sp;

  //    Archiver ar;
//    @GET
//    public OneSession messages() {
//        return new OneSession("duke2");
//    }
  @GET
  public JsonObject messages() {
    sp.getSessions();
    return Json.createObjectBuilder().add("name-json", "asdasdasd").build();
//sp.getSessions()).build();∫
  }

}
