//package com.example.project.entity;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
//
//@Entity
//public class UserRole {
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private long userRoleid;
//	
//	
//	//@ManyToOne(fetch=FetchType.EAGER)
//	private User user;
//	
//	//@ManyToOne
//	//private Role role;
//	
//	
//
//	public UserRole() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	public UserRole(long userRoleid, User user, Role role) {
//		super();
//		this.userRoleid = userRoleid;
//		this.user = user;
//		//this.role = role;
//	}
//
//	public long getUserRoleid() {
//		return userRoleid;
//	}
//
//	public void setUserRoleid(long userRoleid) {
//		this.userRoleid = userRoleid;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
////	public Role getRole() {
////		return role;
////	}
////
////	public void setRole(Role role) {
////		this.role = role;
////	}
//	
//	
//}
