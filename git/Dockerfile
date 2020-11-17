FROM ubuntu:16.04

ARG DEBIAN_FRONTEND=noninteractive

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64
ENV PATH $JAVA_HOME/bin:$PATH
ENV DISPLAY=:0

RUN apt-get update && apt-get -y install openjdk-8-jre xvfb x11vnc