FROM java:8

COPY src /var/www/java/
COPY build/libs /var/www/merchantgalaxy

WORKDIR /var/www/merchantgalaxy

EXPOSE 8080

CMD ["java", "-jar", "merchantGalaxy.jar"]
