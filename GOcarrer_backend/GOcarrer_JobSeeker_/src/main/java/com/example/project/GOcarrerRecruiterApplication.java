package com.example.project;


import java.util.HashSet;  
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;


//import com.example.project.entity.Role;
import com.example.project.entity.User;
//import com.example.project.entity.UserRole;
import com.example.project.service.UserService;
//import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients
public class GOcarrerRecruiterApplication {

	@Autowired
	private UserService userService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(GOcarrerRecruiterApplication.class, args);
	}
	
	
//	public void run(String... args) throws Exception{
//		try {
//		
//		User user=new User();
//		
//		user.setName("akash");
//		user.setUsername("akzz");
//		user.setSkills("Coder");
//		user.setEmail("akash@gmail.com");
//		
//		Role role1=new Role();
//		role1.setRoleid(1212);
//		role1.setRoleName("admin");
//		
//		Set<UserRole> userRoleSet=new HashSet<>();
//		
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//
//        userRole.setUser(user);
//
//        userRoleSet.add(userRole);
//
//        User user1 = this.userService.createUser(user, userRoleSet);
//        System.out.println(user1.getUsername());
//	}catch(UserFoundException e) {
//		e.printStackTrace();
//	}
//	}
}
