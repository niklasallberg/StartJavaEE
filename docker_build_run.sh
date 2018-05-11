#!/usr/bin/env bash
docker build --tag=wildfly-app .
docker rm wildfly-app
docker run --name wildfly-app -p 8080:8080 -p 9990:9990 -p 9999:9999 -p 8787:8787 -it wildfly-app
#docker run --name wildfly-app -p 8080:8080 -p 9990:9990 -p 8787:8787 -v /Users/niklas.allberg/projects/StartJavaEE/build/libs/:/opt/jboss/wildfly/standalone/deployments/ -it wildfly-app
#docker run --name wildfly-app -p 8080:8080 -p 9990:9990 -p 8787:8787 -it wildfly-app
