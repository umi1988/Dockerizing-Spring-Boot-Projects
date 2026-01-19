package com.starttohkar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGoogleJibDockerImageApplication {

	@GetMapping("/message")
	public String message(){
		return "Dockerize java application using Google jib";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGoogleJibDockerImageApplication.class, args);
	}

}
