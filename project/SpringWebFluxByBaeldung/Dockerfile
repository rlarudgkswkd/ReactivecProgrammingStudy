# docker 참조링크
# https://zzang9ha.tistory.com/360

# Use an official Java runtime as a parent image
FROM openjdk:11

# 인자 정리
ARG JAR_FILE=target/*.jar

# 앞에는 HOST OS의 현재 폴더를 의미
# 뒤에는 컨테이너의 현재 폴더(WORKDIR)를 의미
COPY ${JAR_FILE} app.jar

# 안해도 되지만, 하는게 좋습니다.
# 이 컨테이너는 8080 포트를 사용한다는 의미 입니다.
EXPOSE 8070

# docker run 명령에서 실행항 명령어
ENTRYPOINT ["java","-jar","/app.jar"]
# java 옵션 처리
# ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","/app.jar"]