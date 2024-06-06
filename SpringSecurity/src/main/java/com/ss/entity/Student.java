package com.ss.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	private int id;
	private String name;
	private int age;
	private String tech;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", tech=" + tech + "]";
	}
	public void add(Student student) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
