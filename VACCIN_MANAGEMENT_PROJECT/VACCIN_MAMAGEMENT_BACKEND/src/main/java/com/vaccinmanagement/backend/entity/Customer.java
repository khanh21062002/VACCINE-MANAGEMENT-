package com.vaccinmanagement.backend.entity;

import com.vaccinmanagement.backend.enums.Gender;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "customer_id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    @Column(name = "fullname_customer", nullable = false, length = 50)
    private String fullName;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "gender")
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Column(name = "indentity_card", nullable = false, length = 10, unique = true)
    private String identityCard;

    @Column(name = "customer_address", nullable = false, length = 100)
    private String customerAddress;

    @Column(name = "username_customer", nullable = false, length = 50, unique = true)
    private String user;

    @Column(name = "password_customer", nullable = false, length = 50)
    private String password;

    @Column(name = "email_customer", nullable = false, length = 25)
    private String email;

    @Column(name = "phone_customer", nullable = false, length = 11 )
    private String phoneNumber;

    public Customer() {}

    public Customer(Integer customerId, String fullName, Date dateOfBirth, Gender gender, String identityCard, String customerAddress, String user, String password, String email, String phoneNumber) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identityCard = identityCard;
        this.customerAddress = customerAddress;
        this.user = user;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
