package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot2ThymeleafDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2ThymeleafDemo1Application.class, args);
	}
	
	
//	 http://localhost:8080/
//	 http://localhost:8080/thymeleafTemplate?name=Test
	 
}

/* Tomcat Deployent */
//@SpringBootApplication
//public class Springboot2ThymeleafDemo1Application extends SpringBootServletInitializer {
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(Springboot2ThymeleafDemo1Application.class);
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(Springboot2ThymeleafDemo1Application.class, args);
//	}
//}
