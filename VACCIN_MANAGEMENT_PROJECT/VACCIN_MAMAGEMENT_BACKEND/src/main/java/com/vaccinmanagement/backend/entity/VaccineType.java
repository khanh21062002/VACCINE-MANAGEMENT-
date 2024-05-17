package com.vaccinmanagement.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vaccine_type")
public class VaccineType {
	
	@Id
	@Column(name = "vaccine_type_code", length = 8, unique = true, nullable = false )
	private String vaccineTypeCode;
	
	@Column(name = "vaccine_type_name", length = 255, nullable = false, unique = true)
	private String vaccineTypeName;
	
	@Column(name = "active")
	private boolean active;
	
	@Column(name = "description", length = 255, nullable = false)
	private String description;
	
	@Column(name = "vaccine_type_image")
	private String vaccineTypeImage;

	@OneToOne(mappedBy = "vaccineType",cascade = CascadeType.ALL,orphanRemoval = true)
	private Vaccine vaccine;

	public VaccineType() {

	}

	public VaccineType(String vaccineTypeCode, String vaccineTypeName, boolean active, String description, String vaccineTypeImage, Vaccine vaccine) {
		this.vaccineTypeCode = vaccineTypeCode;
		this.vaccineTypeName = vaccineTypeName;
		this.active = active;
		this.description = description;
		this.vaccineTypeImage = vaccineTypeImage;
		this.vaccine = vaccine;
	}

	public String getVaccineTypeCode() {
		return vaccineTypeCode;
	}

	public void setVaccineTypeCode(String vaccineTypeCode) {
		this.vaccineTypeCode = vaccineTypeCode;
	}

	public String getVaccineTypeName() {
		return vaccineTypeName;
	}

	public void setVaccineTypeName(String vaccineTypeName) {
		this.vaccineTypeName = vaccineTypeName;
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

	public String getVaccineTypeImage() {
		return vaccineTypeImage;
	}

	public void setVaccineTypeImage(String vaccineTypeImage) {
		this.vaccineTypeImage = vaccineTypeImage;
	}

	public Vaccine getVaccine() {
		return vaccine;
	}

	public void setVaccine(Vaccine vaccine) {
		this.vaccine = vaccine;
	}
}
