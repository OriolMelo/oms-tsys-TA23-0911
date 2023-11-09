package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestSpringGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringGradleApplication.class, args);
	}

	@GetMapping("/hola")
	public String helloWorld() {
		return String.format("Hola mundo");
	}
}
