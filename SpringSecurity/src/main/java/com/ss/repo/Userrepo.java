package com.ss.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ss.entity.User;

public interface Userrepo extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
