package com.example.project.service.impl;

import java.util.List;  
import java.util.Set; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.example.project.dao.RoleRepository;
import com.example.project.dao.UserRepository;
import com.example.project.entity.User;
//import com.example.project.entity.UserRole;
import com.example.project.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	
	//private RoleRepository roleRepository;
	
	@Override
    public User createUser(User user) throws Exception {

        User local = this.userRepository.findByUsername(user.getUsername());
       
        if(local!=null) {
        	System.out.println("User is already there");
        	throw new Exception("User already Present");
        }
        else {
//        	for (UserRole ur : userRoles) {
//                roleRepository.save(ur.getRole());
//            }
        	
        	//user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);
        }
        System.out.print(local);
        return local;
    }
	
	@Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);
    }
    
    @Override
	public List<User> getalldetails(){
			
			List<User> details=(List<User>) this.userRepository.findAll() ;
			return details;
		}
}
