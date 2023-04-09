package com.example.project.entity;

import java.util.HashSet; 
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;


@Entity
public class User{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	private String name;
	private String username;
	private String password;

	private String email;
	private int contact;
	private String skills;
	
	private boolean enabled=true;
//	
//	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER,mappedBy="user")
//	private Set<UserRole> userRoles=new HashSet<>();

	

	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}





	public User(Long id, String name, String username, String email, int contact, String skills, boolean enabled,
			 String password) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.skills = skills;
		this.enabled = enabled;
		//this.userRoles = userRoles;
	}





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getUsername() {
		return username;
	}





	public void setUsername(String username) {
		this.username = username;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


	public int getContact() {
		return contact;
	}





	public void setContact(int contact) {
		this.contact = contact;
	}





	public String getSkills() {
		return skills;
	}





	public void setSkills(String skills) {
		this.skills = skills;
	}





	public boolean isEnabled() {
		return enabled;
	}





	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}





//	public Set<UserRole> getUserRoles() {
//		return userRoles;
//	}
//
//
//
//
//
//	public void setUserRoles(Set<UserRole> userRoles) {
//		this.userRoles = userRoles;
//	}


	
	
	
	


	public List<jobdatabase> getJobs() {
		return jobs;
	}


	public void setJobs(List<jobdatabase> jobs) {
		this.jobs = jobs;
	}


	@Transient
	private List<jobdatabase> jobs;
	
	
}