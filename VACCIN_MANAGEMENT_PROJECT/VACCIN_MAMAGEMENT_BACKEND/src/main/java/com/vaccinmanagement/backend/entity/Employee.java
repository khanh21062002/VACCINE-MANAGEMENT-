package com.vaccinmanagement.backend.entity;

import java.util.Date;

import com.vaccinmanagement.backend.enums.Gender;
import com.vaccinmanagement.backend.enums.Position;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@Builder
//@AllArgsConstructor
//@NoArgsConstructor
public class Employee {
	
	@Id
	@Column(name = "employee_id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	
	@Column(name = "employee_name", length = 255, nullable = false, unique = true)
	private String employeeName;
	
	@Column(name = "date_of_birth", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
    @Column(name = "gender")
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    
    @Column(name = "phone_number" , length = 11, nullable = false, unique = true)
    private String phoneNumber;
    
    @Column(name = "address_employee", length = 255 , nullable = false, unique = true)
    private String addressEmployee;
    
    @Column(name = "employee_email", length = 255, nullable = false, unique = true)
    private String employeeEmail;
    
    @Column(name = "working_place", length = 255)
    private String workingPlace;
    
    @Column(name = "position")
    @Enumerated(value = EnumType.STRING)
    private Position position;
    
    @Column(name = "employee_image")
    private String employeeImage;
    
    public Employee() {

    }

	public Employee(Integer employeeId, String employeeName, Date dateOfBirth, Gender gender, String phoneNumber, String addressEmployee, String employeeEmail, String workingPlace, Position position, String employeeImage) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.addressEmployee = addressEmployee;
		this.employeeEmail = employeeEmail;
		this.workingPlace = workingPlace;
		this.position = position;
		this.employeeImage = employeeImage;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddressEmployee() {
		return addressEmployee;
	}

	public void setAddressEmployee(String addressEmployee) {
		this.addressEmployee = addressEmployee;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getWorkingPlace() {
		return workingPlace;
	}

	public void setWorkingPlace(String workingPlace) {
		this.workingPlace = workingPlace;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getEmployeeImage() {
		return employeeImage;
	}

	public void setEmployeeImage(String employeeImage) {
		this.employeeImage = employeeImage;
	}
}
