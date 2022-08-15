FROM openjdk:8
EXPOSE 8080
ADD target/springboot-sch-image.jar springboot-sch-image.jar
ENTRYPOINT ["java","-jar","springboot-sch-image.jar"]
