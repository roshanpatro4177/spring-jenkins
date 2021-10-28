package com.roshan.spring.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	private void init() {
		log.info("Hello Roshan");

	}

	public static void main(String[] args) {
		log.info("Into main method");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
