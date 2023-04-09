package com.jwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.model.Recruiter;
import com.jwt.model.User;

public interface RecruiterRepository extends JpaRepository<Recruiter, Long> {
	
	
	public Recruiter findByUsername(String username);
}
