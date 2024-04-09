package com.vaccinmanagement.backend.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "VaccinationResult")
public class VaccinationResult {

    @Id
    @Column(name = "id_vaccination_result")
    private int id_vaccination_result;

    @OneToOne
    @JoinColumn(name = "id_customer_vaccination_result")
    private Customer id_customer_vaccination_result;

    @OneToOne
    @JoinColumn(name = "customer_name_vaccination", nullable = false)
    private Customer customer_name_vaccination;

    @OneToOne
    @JoinColumn(name = "dob_customer_vaccination", nullable = false)
    private Customer dob_customer_vaccination;

    @OneToOne
    @JoinColumn(name = "vaccine_type_of_customer")
    private VaccineType vaccine_type;

    @OneToOne
    @JoinColumn(name = "prevention_vaccination_result", nullable = false)
    private Customer prevention_vaccination_result;

    @Column(name = "injection_customer", nullable = false, length =10)
    private int injection_customer;

    @Column(name = "date_of_injection", nullable = false, length = 50)
    private Date date_of_injection;

    @Column(name = "next_injection_appointment", nullable = false, length = 50)
    private Date next_injection_appointment;

    public VaccinationResult() {
    }

    public VaccinationResult(int id_vaccination_result, Customer id_customer_vaccination_result, Customer customer_name_vaccination, Customer dob_customer_vaccination, VaccineType vaccine_type, Customer prevention_vaccination_result, int injection_customer, Date date_of_injection, Date next_injection_appointment) {
        this.id_vaccination_result = id_vaccination_result;
        this.id_customer_vaccination_result = id_customer_vaccination_result;
        this.customer_name_vaccination = customer_name_vaccination;
        this.dob_customer_vaccination = dob_customer_vaccination;
        this.vaccine_type = vaccine_type;
        this.prevention_vaccination_result = prevention_vaccination_result;
        this.injection_customer = injection_customer;
        this.date_of_injection = date_of_injection;
        this.next_injection_appointment = next_injection_appointment;
    }

    public int getId_vaccination_result() {
        return id_vaccination_result;
    }

    public void setId_vaccination_result(int id_vaccination_result) {
        this.id_vaccination_result = id_vaccination_result;
    }

    public Customer getId_customer_vaccination_result() {
        return id_customer_vaccination_result;
    }

    public void setId_customer_vaccination_result(Customer id_customer_vaccination_result) {
        this.id_customer_vaccination_result = id_customer_vaccination_result;
    }

    public Customer getCustomer_name_vaccination() {
        return customer_name_vaccination;
    }

    public void setCustomer_name_vaccination(Customer customer_name_vaccination) {
        this.customer_name_vaccination = customer_name_vaccination;
    }

    public VaccineType getVaccine_type() {
        return vaccine_type;
    }

    public void setVaccine_type(VaccineType vaccine_type) {
        this.vaccine_type = vaccine_type;
    }

    public Customer getDob_customer_vaccination() {
        return dob_customer_vaccination;
    }

    public void setDob_customer_vaccination(Customer dob_customer_vaccination) {
        this.dob_customer_vaccination = dob_customer_vaccination;
    }

    public Customer getPrevention_vaccination_result() {
        return prevention_vaccination_result;
    }

    public void setPrevention_vaccination_result(Customer prevention_vaccination_result) {
        this.prevention_vaccination_result = prevention_vaccination_result;
    }

    public int getInjection_customer() {
        return injection_customer;
    }

    public void setInjection_customer(int injection_customer) {
        this.injection_customer = injection_customer;
    }

    public Date getDate_of_injection() {
        return date_of_injection;
    }

    public void setDate_of_injection(Date date_of_injection) {
        this.date_of_injection = date_of_injection;
    }

    public Date getNext_injection_appointment() {
        return next_injection_appointment;
    }

    public void setNext_injection_appointment(Date next_injection_appointment) {
        this.next_injection_appointment = next_injection_appointment;
    }
}
