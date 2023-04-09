package com.example.GOcarrer_Admin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.GOcarrer_Admin.dao.admindatabaserepo;
import com.example.GOcarrer_Admin.entity.User;
import com.example.GOcarrer_Admin.entity.jobdatabase;



@RestController
@CrossOrigin
public class Maincontroller {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	admindatabaserepo repo; 
	
	
	@GetMapping("/userdetails")
	public List<User> getjob() {
			
		ArrayList<User> userDetails=restTemplate.getForObject("http://Jobseeker-Service/getdetails", ArrayList.class);
		
		
		return userDetails;
	}
	
	@GetMapping("/companydetails")
	public List<jobdatabase> getcompanydetails() {
			
		ArrayList<jobdatabase> companyDetails=restTemplate.getForObject("http://RECRUITER-SERVICE/alldetails", ArrayList.class);
		
		
		return companyDetails;
	}
	
	
//	@DeleteMapping("/alldetails/{id}")
//	public ResponseEntity<Void> deleteBook(@PathVariable("id") int jId) {
//		try {
//			this.repo.deletejob(jId);
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//		}
//
//	}
}
