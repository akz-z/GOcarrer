package com.example.project.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class jobdatabase {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String title;
	private String email;
	private String loaction;
	private int salary;
	private String role;
	
	@Transient
	private List<User> user;
	public jobdatabase() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public jobdatabase(int id, String name, String title, String email, String loaction, int salary, String role) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.email = email;
		this.loaction = loaction;
		this.salary = salary;
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoaction() {
		return loaction;
	}

	public void setLoaction(String loaction) {
		this.loaction = loaction;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "jobdatabase [id=" + id + ", name=" + name + ", title=" + title + ", email=" + email + ", loaction="
				+ loaction + ", salary=" + salary + "]";
	}
	
	
	
}
