package com.javabrains.springrest.greet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@RequestMapping("/greet")
	public String sayHi() {
		return "Hi";
	}
	
}
