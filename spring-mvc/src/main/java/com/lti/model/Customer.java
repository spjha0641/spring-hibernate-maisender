package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_mvc_cust")
public class Customer {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;

	private String email;
	
	private String password;
	
	private LocalDate dateOfBirth;
	
	private String profilePicFileName;
	
	public String getProfilePicFileName() {
		return profilePicFileName;
	}
	public void setProfilePicFileName(String profilePicFileName) {
		this.profilePicFileName = profilePicFileName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}
	
	


}
