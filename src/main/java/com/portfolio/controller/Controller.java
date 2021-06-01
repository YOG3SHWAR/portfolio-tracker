package com.portfolio.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String HelloWorld() {
		return "Hello WorlD";
	}
	
	@GetMapping("/restricted")
	public Principal restricted (Principal principal) {
		return principal;
	}
	
}
