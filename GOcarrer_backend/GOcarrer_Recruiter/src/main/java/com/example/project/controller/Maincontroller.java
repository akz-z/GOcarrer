package com.example.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.project.dao.jobdatabaserepo;
import com.example.project.entity.User;
//import com.example.project.entity.JobSeeker;
import com.example.project.entity.jobdatabase;
//import com.example.project.helper.Message;
import com.example.project.service.postservice;

import jakarta.servlet.http.HttpSession;

@RestController
public class Maincontroller {

	@Autowired
	private postservice ps;
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/alldetails")
	public ResponseEntity<List<jobdatabase>> getalldetails() {

		List<jobdatabase> list = ps.getalldetails();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
	
	
	@GetMapping("/userdetails")
	public List<User> getjob() {
			
		ArrayList<User> details=restTemplate.getForObject("http://Jobseeker-Service/getdetails", ArrayList.class);
		
		
		return details;
	}
	
	
	@PostMapping("/addjobs")
	public ResponseEntity<jobdatabase> addjobdatabase(@RequestBody jobdatabase db) {

		jobdatabase result = null;
		try {
			result = this.ps.adduser(db);

			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DeleteMapping("/alldetails/{id}")
	public ResponseEntity<Void> deleteBook(@PathVariable("id") int jId) {
		try {
			this.ps.deletejob(jId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	
	@PutMapping("/alldetails/{jid}")
	 public ResponseEntity<jobdatabase> updateBook(@RequestBody jobdatabase job, @PathVariable("jid") int jId) {
        try {
        	this.ps.updatejob(job, jId);
            return ResponseEntity.ok().body(job);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

       
    }
}
