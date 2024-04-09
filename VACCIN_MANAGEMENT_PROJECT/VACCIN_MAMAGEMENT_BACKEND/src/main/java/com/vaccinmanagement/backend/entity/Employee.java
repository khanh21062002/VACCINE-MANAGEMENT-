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

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@Column(name = "employee_id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employee_id;
	
	@Column(name = "employee_name", length = 256, nullable = false, unique = true)
	private String employee_name;
	
	@Column(name = "date_of_birth", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date date_of_birth;
	
    @Column(name = "Gender")
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    
    @Column(name = "phone_number" , length = 10, nullable = false, unique = true)
    private String phone_number;
    
    @Column(name = "address_employee", length = 255 , nullable = false, unique = true)
    private String address_employee;
    
    @Column(name = "email_employee", length = 256, nullable = false, unique = true)
    private String email_employee;
    
    @Column(name = "working_place", length = 256, nullable = false, unique = true)
    private String working_place;
    
    @Column(name = "position")
    @Enumerated(value = EnumType.STRING)
    private Position position;
    
    @Column(name = "employee_image", nullable = false, length = 255)
    private String employee_image;
    
    public Employee() {
    	
    }

	public Employee(Integer employee_id, String employee_name, Date date_of_birth, Gender gender, String phone_number,
			String address_employee, String email_employee, String working_place, Position position,
			String employee_image) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.phone_number = phone_number;
		this.address_employee = address_employee;
		this.email_employee = email_employee;
		this.working_place = working_place;
		this.position = position;
		this.employee_image = employee_image;
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress_employee() {
		return address_employee;
	}

	public void setAddress_employee(String address_employee) {
		this.address_employee = address_employee;
	}

	public String getEmail_employee() {
		return email_employee;
	}

	public void setEmail_employee(String email_employee) {
		this.email_employee = email_employee;
	}

	public String getWorking_place() {
		return working_place;
	}

	public void setWorking_place(String working_place) {
		this.working_place = working_place;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getEmployee_image() {
		return employee_image;
	}

	public void setEmployee_image(String employee_image) {
		this.employee_image = employee_image;
	}
    
    

    
    
	
}
