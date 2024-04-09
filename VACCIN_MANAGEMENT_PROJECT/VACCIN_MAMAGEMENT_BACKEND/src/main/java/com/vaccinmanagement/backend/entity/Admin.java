package com.vaccinmanagement.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	
	@Id
	@Column(name = "admin_id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer admin_id;
	
	@Column(name = "AdminName" , nullable = false, length = 255, unique = true)
	private String admin_name;
	
    @Column(name = "email", nullable = false, length = 255, unique = true)
    private String email;
	
	@Column(name = "Password", nullable = false, length = 255)
	private String password;

	public Admin() {

	}

	public Admin(Integer admin_id, String admin_name, String email, String password) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.email = email;
		this.password = password;
	}

	public Integer getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
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
	
	
}
