package com.example.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.entity.User; 

  





public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);
}
