package com.ss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.ss.config.JwtServiceconfig;
import com.ss.entity.User;
import com.ss.service.UserService;

@RestController
public class Usercontroller {
	
	@Autowired
	private UserService service;

	
	AuthenticationManager am;

	//@Autowired
	//private JwtServiceconfig jwtService;
	
	@PostMapping("register")
	public void userinfo(@RequestBody User u) {
		service.save(u);
	}
	
//	@PostMapping("login")
//	public String login(@RequestBody User u){
//		
//		
//		Authentication aut = am.authenticate(new UsernamePasswordAuthenticationToken(u.getUsername(), u.getPassword()));
//
//		if(aut.isAuthenticated())
//			return jwtService.generateToken(u.getUsername());
//		else
//			return "Login Failed";
//
//	}
	
	
}
