FROM ubuntu:16.04

ARG DEBIAN_FRONTEND=noninteractive

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64
ENV PATH $JAVA_HOME/bin:$PATH
ENV DISPLAY=192.168.0.20:0


# Install various packages
RUN apt-get update && apt-get install -y net-tools wget iputils-ping xorg xdg-utils openjdk-8-jre xvfb x11vnc curl software-properties-common apt-transport-https ca-certificates apt-utils


# Install firefox
RUN apt-get update
RUN apt-get -y -f install firefox

#/private/tmp/com.apple.launchd.wwVsU0z4aA/org.macosforge.xquartz:0