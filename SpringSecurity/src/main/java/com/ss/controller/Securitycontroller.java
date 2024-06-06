package com.ss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class Securitycontroller {

	@GetMapping("/Hello")
	public String greet(HttpServletRequest request) {
		return "Hello World "+request.getSession().getId();
	}

	@GetMapping("/About")
	public String about(HttpServletRequest request) {
		return "Welcome "+request.getSession().getId();
	}
}
