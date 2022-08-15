package com.example.ass4client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ass4client1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ass4client1Application.class, args);
	}

}
