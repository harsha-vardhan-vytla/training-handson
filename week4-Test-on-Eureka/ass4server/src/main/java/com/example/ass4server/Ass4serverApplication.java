package com.example.ass4server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ass4serverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ass4serverApplication.class, args);
	}

}
