#!/bin/sh
java -Xmx350m -Xss256k -XX:+UseContainerSupport \
  -Dspring.datasource.url="$SPRING_DATASOURCE_URL" \
  -Dspring.datasource.username="$SPRING_DATASOURCE_USERNAME" \
  -Dspring.datasource.password="$SPRING_DATASOURCE_PASSWORD" \
  -jar app.jar
