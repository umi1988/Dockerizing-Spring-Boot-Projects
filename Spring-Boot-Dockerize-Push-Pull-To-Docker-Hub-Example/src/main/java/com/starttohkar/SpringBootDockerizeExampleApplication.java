package com.starttohkar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerizeExampleApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "welcome to docker first app";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerizeExampleApplication.class, args);
	}

}
