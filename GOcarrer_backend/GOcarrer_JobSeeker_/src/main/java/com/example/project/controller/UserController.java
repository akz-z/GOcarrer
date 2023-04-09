package com.example.project.controller;

import java.util.HashSet; 
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.project.entity.Role;
import com.example.project.entity.User;
//import com.example.project.entity.UserRole;
import com.example.project.entity.jobdatabase;
import com.example.project.service.UserService;



@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {

	

    @Autowired
    private UserService userService;
    
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {


  
//
//        Set<UserRole> roles = new HashSet<>();
//
//        Role role = new Role();
//        role.setRoleid(45);
//        role.setRoleName("NORMAL");
//
//        UserRole userRole = new UserRole();
//        userRole.setUser(user);
        //userRole.setRole(role);

       // roles.add(userRole);


        return this.userService.createUser(user);

    }
//    @GetMapping("/alldetails")
//	public ResponseEntity<List<jobdatabase>> getalldetails() {
//
//		List<jobdatabase> list = ps.getalldetails();
//		if (list.size() <= 0) {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//		}
//		return ResponseEntity.status(HttpStatus.CREATED).body(list);
//	}
    
    @GetMapping("/getdetail")
	public ResponseEntity<List<User>> getalldetails() {

		List<User> list = userService.getalldetails();
		System.out.print(list);
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
    
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username) {
        return this.userService.getUser(username);
    }

    //delete the user by id
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) {
        this.userService.deleteUser(userId);
    }
}
