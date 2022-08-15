package com.example.ass4client2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controller {

	@GetMapping("/actuator/info")
	public String start() {
		return "welcome to atm";
		
	}
}
