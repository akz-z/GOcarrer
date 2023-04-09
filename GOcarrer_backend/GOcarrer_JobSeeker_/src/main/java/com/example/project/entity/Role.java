//package com.example.project.entity;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//
//@Entity
//public class Role {
//
//	@Id
//	private long roleid;
//	private String roleName;
//
//	public Role(long roleid, String roleName) {
//		super();
//		this.roleid = roleid;
//		this.roleName = roleName;
//	}
//
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "role")
//	private Set<UserRole> userRoles = new HashSet<>();
//
//	public Set<UserRole> getUserRoles() {
//		return userRoles;
//	}
//
//	public void setUserRoles(Set<UserRole> userRoles) {
//		this.userRoles = userRoles;
//	}
//
//	public Role() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public long getRoleid() {
//		return roleid;
//	}
//
//	public void setRoleid(long roleid) {
//		this.roleid = roleid;
//	}
//
//	public String getRoleName() {
//		return roleName;
//	}
//
//	public void setRoleName(String roleName) {
//		this.roleName = roleName;
//	}
//
//}
