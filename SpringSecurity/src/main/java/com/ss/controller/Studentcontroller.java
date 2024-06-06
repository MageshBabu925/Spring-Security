package com.ss.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ss.entity.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class Studentcontroller {
	
	List<Student> s = new ArrayList<>();/*
										 * (List.of(new Student(1,"Bhuvanesh",23,"AI"), new
										 * Student(3,"Jaya",24,"Full Stack"), new
										 * Student(2,"Feroz khan",40,"DataScience") ));
										 */
//	@PostMapping("/getstudents")
//	public void addstudents(@RequestBody Student stud) {
//		s.add(stud);
//	}
	
	
	
	 @PostMapping("/getallstudents")
		public Student getallstudents1(){
	    	Student stud = new Student();
	        
	    	stud.add(new Student(1, "Black", 23, "ML"));
	    	stud.add(new Student(2, "White", 21, "AI"));
	    	stud.add(new Student(3, "Green", 22, "Data Science"));
	        
	        return stud;
			
	    }
	
    @GetMapping("/getallstudents")
	public List<Student> getallstudents(){
		 return s;
		
    }
    @GetMapping("/csrftoken")
	public CsrfToken getcsrftoken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
	
}
