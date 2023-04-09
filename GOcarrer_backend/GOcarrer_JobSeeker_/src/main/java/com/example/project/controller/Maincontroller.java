package com.example.project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.project.entity.User;
import com.example.project.entity.jobdatabase;
import com.example.project.service.postJsdetails;
//import com.example.project.service.recruiterService;

@RestController
public class Maincontroller {
	
	@Autowired
	private postJsdetails service;
	
	@Autowired
	private RestTemplate restTemplate;
	
	//@Autowired
	//private recruiterService rs;
	
	@GetMapping("/getdetails")
	public ResponseEntity<List<User>> jobseekerdetails() {
		
		List<User> list = service.getalldetails();
		
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
	
	@PostMapping("/postdetails")
	public ResponseEntity<User> addjobdatabase(@RequestBody User db) {

		User result = null;
		try {
			result = this.service.adduser(db);

			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	//http://localhost:8082/alldetails
	@GetMapping("/joblist")
	public List<jobdatabase> getjob() {
			
		ArrayList<jobdatabase> jobs=restTemplate.getForObject("http://RECRUITER-SERVICE/alldetails", ArrayList.class);
		
		
		return jobs;
	}
}


