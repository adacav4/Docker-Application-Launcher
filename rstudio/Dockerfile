FROM rocker/rstudio

ARG DEBIAN_FRONTEND=noninteractive

ENV DISPLAY=192.168.0.20:0
ENV USER=rstudio
ENV PASSWORD=qwerty

# Xorg needed (ubuntu java container already installs xorg)?
RUN apt-get update && apt-get -y install wget xorg xdg-utils xvfb x11vnc

# Install chromium
# RUN apt-get -y -f install chromium-browser

# Install firefox
RUN apt-get -y -f install firefox

# Open a Firefox window (just for testing) 
RUN xdg-open http://localhost:8787


### DOESN'T WORK  ###
# Open a Chromium window (just for testing)
# RUN chromium http://localhost:8787
