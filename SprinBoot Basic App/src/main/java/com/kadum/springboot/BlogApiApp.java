package com.kadum.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApiApp {
	public static void main(String[] args) {
        SpringApplication.run(BlogApiApp.class, args);
        //1. Setup Default configuration
        //2. Starts Spring application context
        //3. Class path scan
        //4. Starts embedded Tomcat server
	}

}
