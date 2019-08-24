package com.codesample.savemovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SavemovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(SavemovieApplication.class, args);
	}

}
