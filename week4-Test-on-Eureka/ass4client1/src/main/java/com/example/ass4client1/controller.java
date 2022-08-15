package com.example.ass4client1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@GetMapping("/actuator/info")
	public String start() {
		return "welcome internet banking";
	}
}
