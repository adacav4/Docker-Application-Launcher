FROM rocker/rstudio

ARG DEBIAN_FRONTEND=noninteractive

ENV DISPLAY=10.215.211.156:0
ENV USER=rstudio
ENV PASSWORD=qwerty

RUN apt-get update && apt-get -y install wget xorg xdg-utils xvfb x11vnc

# Install firefox
# RUN apt-get -f install firefox

# open a Firefox window
# RUN xdg-open http://localhost:8787
