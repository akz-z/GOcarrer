package com.example.GOcarrer_Admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GOcarrer_Admin.dao.admindatabaserepo;

@Service
public class adminService {
	
	
	@Autowired
	private admindatabaserepo repo;
	
	public void deletejob(int jid) {

        repo.deleteById(jid);
    }

}
