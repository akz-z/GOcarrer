package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.dao.jobdatabaserepo;
import com.example.project.entity.jobdatabase;


@Service
public class postservice {
	
	@Autowired
	private jobdatabaserepo repo;
	
	//to list all the jobs posted
	public List<jobdatabase> getalldetails(){
		
		List<jobdatabase> details=(List<jobdatabase>) this.repo.findAll();
		return details;
	}
	
//	public jobdatabase findbyid(int id){
//		
//		jobdatabase user= null;
//		user=this.repo.findBYid(id);
//		
//		return user;
//		
//	}
	
	//to add job
	public jobdatabase adduser(jobdatabase db) {
			
		System.out.print("SAved in dadtabsae.....");
		jobdatabase result=repo.save(db);
		return result;
	}
	
	//to delete job
	public void deletejob(int jid) {

        repo.deleteById(jid);
    }
	
	//to update job
	public void updatejob(jobdatabase job,int jid) {
		
		job.setId(jid);
		repo.save(job);
	}
}
