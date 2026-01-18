package com.starttohkar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCreateRunDockerImageApplication {

	@GetMapping("/")
	public String runImage(){
		return "Docker Image created and Running...";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCreateRunDockerImageApplication.class, args);
	}

}
