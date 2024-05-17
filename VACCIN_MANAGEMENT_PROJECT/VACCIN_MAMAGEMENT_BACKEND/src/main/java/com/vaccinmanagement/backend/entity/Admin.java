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
	private Integer adminId;
	
	@Column(name = "adminName" , nullable = false, length = 255, unique = true)
	private String adminName;
	
    @Column(name = "email", nullable = false, length = 255, unique = true)
    private String email;
	
	@Column(name = "password", nullable = false, length = 255)
	private String password;

	public Admin() {

	}

	public Admin(Integer adminId, String adminName, String email, String password) {
		this.adminId = adminId;
		this.adminName = adminName;
		this.email = email;
		this.password = password;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
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
