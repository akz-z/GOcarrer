package com.example.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;

import com.example.project.entity.jobdatabase;

public interface jobdatabaserepo extends CrudRepository<jobdatabase, Integer>{
	
	
	public jobdatabaserepo findById(int id);
}
