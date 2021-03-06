package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
		return String.format("Hello %s!", name);
	}

	@GetMapping("/testing")
	public String testing(@RequestParam(value = "name", defaultValue = "testing") String name){
		return String.format("Hello, testing route 1..2 1...2 %s!", name);
	}

	@GetMapping("/usinggit")
	public String usinggit(@RequestParam(value = "name", defaultValue = "using git") String name){
		return String.format("Hello, pulling from git %s!", name);
	}

	@GetMapping("/testingtravis")
	public String travistravis(@RequestParam(value = "name", defaultValue = "using git") String name){
		return String.format("Hello, I'm testing travis ci	 %s!", name);
	}




}
