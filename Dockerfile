FROM tomcat:7

MAINTAINER "Daniel Betsche" <dbetsche@gmail.com>

COPY SocialFunnel-1.0.0.war /usr/local/tomcat/webapps/SocialFunnel.war

ENTRYPOINT ["/bin/bash"]
CMD ["catalina.sh", "run"]

EXPOSE 8080