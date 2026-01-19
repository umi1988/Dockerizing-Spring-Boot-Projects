
Google Jib is actively used and popular for containerizing Java applications today,
especially for its speed, efficiency, and simplicity, integrating directly with Maven/Gradle
without needing a Dockerfile or daemon, making Java development faster by optimizing layers
and speeding up rebuilds for continuous deployment. Developers like it for its performance
benefits, layered caching, and seamless build process integration, supporting major registries
like Docker Hub, GCR, ECR.

Key Reasons Jib is Used Now:
No Dockerfile/Daemon Needed: Builds optimized images directly from your build tool (Maven/Gradle)
                            without requiring Docker to be installed or complex Dockerfiles.
Faster Builds: Achieves efficient caching by separating dependencies from application code,
                rebuilding only changed layers, leading to faster build/test cycles.
Optimized Layers: Creates smaller, more efficient images with fine-grained layering,
                 improving startup times and resource usage.
Seamless Integration: Integrates into CI/CD pipelines as a build plugin, making
                      containerization a standard part of the Java build lifecycle.
Broad Support: Works with popular registries (Docker Hub, Google Container Registry, Amazon ECR, etc.).

Step 1> Open setting.xml, update the below details:-

  <servers>
    <server>
      <id>registry.hub.docker.com</id>
      <username>Dockerhub_Username</username>
      <password>Dockerhub_Password</password>
    </server>
  </servers>

step 2> cmd to create docker image and deploy in docker hub :-
       mvn clean compile jib:build

step 3> cmd to run the docker image which deployed in docker hub in step 2 :-
     docker run -it -p 8080:8080 learn1988/spring-boot-google-jib-docker-image

Step 4> Access the api-
      http://localhost:8080/message
