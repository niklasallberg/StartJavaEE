FROM jboss/wildfly
#ADD build/libs/skinny.war /opt/jboss/wildfly/standalone/deployments/
RUN rm ${JBOSS_HOME}/bin/standalone.conf
ADD standalone.conf ${JBOSS_HOME}/bin/
EXPOSE 8787
RUN /opt/jboss/wildfly/bin/add-user.sh admin Admin#70365 --silent
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]