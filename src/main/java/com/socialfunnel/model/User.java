package com.socialfunnel.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue
	@Column(unique=true)
	private int userId;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String dateOfBirth;
	@OneToMany(mappedBy="user")
	private List<Networks> networks;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String email, String password, String dateOfBirth) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Networks> getNetworks() {
		return networks;
	}

	public void setNetworks(List<Networks> networks) {
		this.networks = networks;
	}
}
