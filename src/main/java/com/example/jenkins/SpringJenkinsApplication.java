package com.example.jenkins;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;



@SpringBootApplication
public class SpringJenkinsApplication {
	
	public  static org.slf4j.Logger logger=org.slf4j.LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application added....");
	}

	public static void main(String[] args) {
		logger.info("Application Executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
