package com.ss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ss.entity.User;
import com.ss.repo.Userrepo;
@Service
public class UserService {
	
	@Autowired
	private Userrepo repo;
	
	private BCryptPasswordEncoder encoder= new BCryptPasswordEncoder(12);

	public void save(User u) {
		u.setPassword(encoder.encode(u.getPassword()));
		System.out.println(u.getPassword());
		repo.save(u);
	}

}
