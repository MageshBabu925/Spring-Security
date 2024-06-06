package com.ss.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ss.entity.User;
import com.ss.entity.UserPrincipal;
import com.ss.repo.Userrepo;


@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private Userrepo repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

	User u= repo.findByUsername(username);
	
	if (u==null) {
		System.out.println("User 404");
		throw new UsernameNotFoundException("User 404");
	}
		 return new UserPrincipal(u);
	}

}