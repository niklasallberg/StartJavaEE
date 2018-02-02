package com.niklas.business.sessions.boundary;

import com.niklas.business.sessions.entity.Speaker;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * @author niklas.allberg
 */
@Stateless
public class SessionProvider {

  private static final String CLASSNAME = SessionProvider.class.getName();
  private final static Logger LOGGER = Logger.getLogger(CLASSNAME);

  @PersistenceContext(unitName = "Niklas")
  EntityManager em;

  public String getSessions() {
    LOGGER.entering(CLASSNAME, "getSessions");
    Speaker speaker = new Speaker();
    em.persist(speaker);
    LOGGER.log(Level.FINE, "Niklas Allberg " + speaker.getId());
    LOGGER.exiting(CLASSNAME, "getSessions");
    return "niklas" + speaker.toString();
  }

  public String getSavedSessions() {
    LOGGER.entering(CLASSNAME, "getSessions");
    TypedQuery<Speaker> query = em.createQuery("select a from Speaker a", Speaker.class);
    List<Speaker> list = query.getResultList();

    LOGGER.exiting(CLASSNAME, "getSessions");
    return "Antal kloppfs" + list.size();
  }
}
