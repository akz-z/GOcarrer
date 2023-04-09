package com.jwt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Recruiter {
	
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String username;
	    private String password;
	    private String email;
	    private String rol;
	    private boolean enabled;
	    
	    
		public Recruiter() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Recruiter(Long id, String username, String password, String email, String rol, boolean enabled) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.email = email;
			this.rol = rol;
			this.enabled = enabled;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getRol() {
			return rol;
		}
		public void setRol(String rol) {
			this.rol = rol;
		}
		public boolean isEnabled() {
			return enabled;
		}
		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
		@Override
		public String toString() {
			return "Recruiter [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
					+ ", rol=" + rol + ", enabled=" + enabled + "]";
		}
	    
	    
}
