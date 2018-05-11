FROM jboss/wildfly:latest
#ADD build/libs/skinny.war /opt/jboss/wildfly/standalone/deployments/
#RUN rm ${JBOSS_HOME}/bin/standalone.conf
#ADD standalone.conf ${JBOSS_HOME}/bin/

USER jboss

EXPOSE 8080 9990 8787

USER jboss

RUN /opt/jboss/wildfly/bin/add-user.sh -u admin -p docker#admin --silent
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "--debug"]
