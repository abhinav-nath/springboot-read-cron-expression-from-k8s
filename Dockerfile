FROM amazoncorretto:17.0.7-alpine

WORKDIR /app

COPY ./build/libs/k8scrontest-1.0.0.jar app.jar
COPY run.sh run.sh

RUN chmod +x run.sh

EXPOSE 8080

ENTRYPOINT ["./run.sh"]
CMD [""]