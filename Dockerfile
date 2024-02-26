FROM openjdk:17
EXPOSE 8080
COPY target/IncentiveCalculation.jar IncentiveCalculation.jar
ENTRYPOINT ["java","-jar","/IncentiveCalculation.jar"]