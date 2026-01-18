1> cmd to create a image:-

 mvn spring-boot:build-image

2> docker cmd to run created image

 docker run --tty --publish 8080:8080 spring-boot-create-run-docker-image:0.0.1-SNAPSHOT

3> api access utl:- http://localhost:8080/
