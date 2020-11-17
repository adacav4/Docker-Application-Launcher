FROM ubuntu:16.04

ARG DEBIAN_FRONTEND=noninteractive

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64
ENV PATH $JAVA_HOME/bin:$PATH
ENV DISPLAY=192.168.0.20:0
RUN apt-get update && apt-get -y install net-tools wget iputils-ping xorg xdg-utils openjdk-8-jre xvfb x11vnc curl


RUN apt-get -y install docker-ce


#RUN apt-get -f install -y libasound2 libatk1.0-0 libcairo2 libcups2 libfontconfig1 libgdk-pixbuf2.0-0 libnspr4 libpango-1.0-0 libxss1 libnss3

#RUN wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
#RUN dpkg -i google-chrome-stable_current_amd64.deb; apt-get -fy install
