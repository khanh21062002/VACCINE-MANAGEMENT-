package com.vaccinmanagement.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vaccine_type")
public class VaccineType {
	
	@Id
	@Column(name = "vaccine_type_code", length = 8, unique = true, nullable = false )
	private String vaccine_type_code;
	
	@Column(name = "vaccine_type_name", length = 255, nullable = false, unique = true)
	private String vaccine_type_name;
	
	@Column(name = "active")
	private boolean active;
	
	@Column(name = "description", length = 255, nullable = false)
	private String description;
	
	@Column(name = "vaccine_type_image")
	private String vaccine_type_image;

//	@OneToOne(mappedBy = "vaccine_type",cascade = CascadeType.ALL,orphanRemoval = true)
//	private Vaccine vaccine;

	public VaccineType() {

	}

	public VaccineType(String vaccine_type_code, String vaccine_type_name, boolean active, String description, String vaccine_type_image, Vaccine vaccine) {
		this.vaccine_type_code = vaccine_type_code;
		this.vaccine_type_name = vaccine_type_name;
		this.active = active;
		this.description = description;
		this.vaccine_type_image = vaccine_type_image;
//		this.vaccine = vaccine;
	}

	public String getVaccine_type_code() {
		return vaccine_type_code;
	}

	public void setVaccine_type_code(String vaccine_type_code) {
		this.vaccine_type_code = vaccine_type_code;
	}

	public String getVaccine_type_name() {
		return vaccine_type_name;
	}

	public void setVaccine_type_name(String vaccine_type_name) {
		this.vaccine_type_name = vaccine_type_name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVaccine_type_image() {
		return vaccine_type_image;
	}

	public void setVaccine_type_image(String vaccine_type_image) {
		this.vaccine_type_image = vaccine_type_image;
	}

//	public Vaccine getVaccine() {
//		return vaccine;
//	}
//
//	public void setVaccine(Vaccine vaccine) {
//		this.vaccine = vaccine;
//	}
}
