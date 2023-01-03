## Sample Spring Boot REST API + PostgreSQL + Docker + AWS/ECS

## Content

Simple example of Spring Boot REST API + PostgreSQL + Docker.

Note: This is not a production ready example.
It is just a sample.
I haven't followed the best practises everywhere in this project.

## Tech Stack

Spring Boot Web, Spring Boot Security, Spring Boot Data JPA, Spring Boot, Docker, Docker Compose, PostgreSQL

## Build

- Build the project: `mvn clean install`
- Run the project: `mvn spring-boot:run`
- Package the project: `mvn clean package`
- Copy the packaged project: `java -jar target/quotes.quiz-0.0.1-SNAPSHOT.jar` to ./src/main/docker

## Docker

- Change 'davidmavrodiev' to your docker hub username in ./src/main/docker/Dockerfile and ./src/main/docker/docker-compose.yml
- Build the image: `docker build -t <username>/sample-rest-api .` using default docker context
- After the image is built, push it to docker hub: `docker push <username>/sample-rest-api`
- Then configure the integration between docker and aws ecs following this [guide](https://docs.docker.com/cloud/ecs-integration/).
- Use the newly created ECS docker context to deploy to the AWS: `docker compose push`

[![IMAGE ALT TEXT HERE](https://forexclub.pl/wp-content/uploads/2018/06/livedemo-1.png)](http://34.201.114.0:8080/api/v1/quiz)

### Resources

[Spring Boot JPA](youtube.com/watch?v=9SGDpanrc8U)

[Spring Security](https://www.youtube.com/watch?v=b9O9NI-RJ3o)

[Microservices](https://www.youtube.com/watch?v=mPPhcU7oWDU)

[Dockerize postgresql dependency](https://www.youtube.com/watch?v=_Gdb-jK3Sr4)
