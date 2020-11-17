FROM rocker/rstudio

ARG DEBIAN_FRONTEND=noninteractive

ENV DISPLAY=:0
ENV USER=rstudio
ENV PASSWORD=qwerty

# Xorg needed (ubuntu java container already installs xorg)?
RUN apt-get update && apt-get -y install wget xorg xdg-utils xvfb x11vnc

# Install chromium
RUN apt-get -y -f install chromium-browser

# open a Chromium window (just for testing)
# RUN chromium http://localhost:8787
