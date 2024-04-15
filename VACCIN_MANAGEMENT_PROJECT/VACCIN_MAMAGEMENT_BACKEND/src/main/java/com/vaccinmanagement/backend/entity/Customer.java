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
    private Integer customer_id;

    @Column(name = "fullname_customer", nullable = false, length = 50)
    private String fullName;

    @Column(name = "date_of_birth")
    private Date date_of_birth;

    @Column(name = "gender")
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Column(name = "indentity_card", nullable = false, length = 10, unique = true)
    private String identity_card;

    @Column(name = "customer_address", nullable = false, length = 100)
    private String customer_address;

    @Column(name = "username_customer", nullable = false, length = 50, unique = true)
    private String user;

    @Column(name = "password_customer", nullable = false, length = 50)
    private String password;

    @Column(name = "email_customer", nullable = false, length = 25)
    private String email;

    @Column(name = "phone_customer", nullable = false, length = 11 )
    private String phoneNumber;

    public Customer() {}

    public Customer(Integer customer_id, String fullName, Date date_of_birth, Gender gender, String identity_card, String customer_address, String user, String password, String email, String phoneNumber) {
        this.customer_id = customer_id;
        this.fullName = fullName;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.identity_card = identity_card;
        this.customer_address = customer_address;
        this.user = user;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getIdentity_card() {
        return identity_card;
    }

    public void setIdentity_card(String identity_card) {
        this.identity_card = identity_card;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
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
