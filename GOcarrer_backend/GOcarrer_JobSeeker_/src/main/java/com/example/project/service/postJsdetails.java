package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.dao.UserRepository;
import com.example.project.entity.User;

@Service
public class postJsdetails {

	@Autowired
	private UserRepository emp;

	// post info

	public User adduser(User user) {

		System.out.print("SAved in dadtabsae.....");
		User result = emp.save(user);
		return result;
	}

	public List<User> getalldetails() {

		List<User> details = (List<User>) this.emp.findAll();
		return details;
	}

}
