# NOT USED #


FROM tensorflow/tensorflow

ENV DISPAY=192.168.0.20:0

RUN apt-get update
RUN apt-get install -y xterm

CMD ["xterm"]

# Open firefox to localhost:8888 on java container?
# CPU-only container: docker run -it --rm --runtime=nvidia tensorflow/tensorflow:latest-gpu python