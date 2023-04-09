package com.example.project.service;

import java.util.List;  
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.project.entity.User;
//import com.example.project.entity.UserRole;


public interface UserService {
	
	
	public User createUser(User user) throws Exception;
	
	public User getUser(String username);
	

	public List<User> getalldetails();

    //delete user by id
    public void deleteUser(Long userId);
}
