FROM ubuntu:16.04

ARG DEBIAN_FRONTEND=noninteractive

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64
ENV PATH $JAVA_HOME/bin:$PATH:/usr/bin
ENV DISPLAY=:0


# Install various packages
RUN apt-get update && apt-get install -y net-tools wget iputils-ping xterm xdg-utils openjdk-8-jre xvfb x11vnc curl software-properties-common apt-transport-https ca-certificates apt-utils


# Install firefox
RUN apt-get update
RUN apt-get -y -f install firefox


# Install Docker-In-Docker
RUN curl -fsSL https://download.docker.com/linux/debian/gpg | apt-key add -
RUN apt-key fingerprint 0EBFCD88
RUN add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
RUN apt-get update
RUN apt-get -y install docker-ce


#/private/tmp/com.apple.launchd.wwVsU0z4aA/org.macosforge.xquartz:0