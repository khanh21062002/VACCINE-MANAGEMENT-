package com.vaccinmanagement.backend.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "vaccinationResult")
public class VaccinationResult {

    @Id
    @Column(name = "id_vaccination_result")
    private int idVaccinationResult;

    @OneToOne
    @JoinColumn(name = "id_customer_vaccination_result")
    private Customer idCustomerVaccinationResult;

    @OneToOne
    @JoinColumn(name = "customer_name_vaccination", nullable = false)
    private Customer customerNameVaccination;

    @OneToOne
    @JoinColumn(name = "dob_customer_vaccination", nullable = false)
    private Customer dobCustomerVaccination;

    @OneToOne
    @JoinColumn(name = "vaccine_type_of_customer")
    private VaccineType vaccineType;

    @OneToOne
    @JoinColumn(name = "prevention_vaccination_result", nullable = false)
    private Customer preventionVaccinationResult;

    @Column(name = "injection_customer", nullable = false, length =10)
    private int injectionCustomer;

    @Column(name = "date_of_injection", nullable = false, length = 50)
    private Date dateOfInjection;

    @Column(name = "next_injection_appointment", nullable = false, length = 50)
    private Date nextInjectionAppointment;

    public VaccinationResult() {
    }

    public VaccinationResult(int idVaccinationResult, Customer idCustomerVaccinationResult, Customer customerNameVaccination, Customer dobCustomerVaccination, VaccineType vaccineType, Customer preventionVaccinationResult, int injectionCustomer, Date dateOfInjection, Date nextInjectionAppointment) {
        this.idVaccinationResult = idVaccinationResult;
        this.idCustomerVaccinationResult = idCustomerVaccinationResult;
        this.customerNameVaccination = customerNameVaccination;
        this.dobCustomerVaccination = dobCustomerVaccination;
        this.vaccineType = vaccineType;
        this.preventionVaccinationResult = preventionVaccinationResult;
        this.injectionCustomer = injectionCustomer;
        this.dateOfInjection = dateOfInjection;
        this.nextInjectionAppointment = nextInjectionAppointment;
    }

    public int getIdVaccinationResult() {
        return idVaccinationResult;
    }

    public void setIdVaccinationResult(int idVaccinationResult) {
        this.idVaccinationResult = idVaccinationResult;
    }

    public Customer getIdCustomerVaccinationResult() {
        return idCustomerVaccinationResult;
    }

    public void setIdCustomerVaccinationResult(Customer idCustomerVaccinationResult) {
        this.idCustomerVaccinationResult = idCustomerVaccinationResult;
    }

    public Customer getCustomerNameVaccination() {
        return customerNameVaccination;
    }

    public void setCustomerNameVaccination(Customer customerNameVaccination) {
        this.customerNameVaccination = customerNameVaccination;
    }

    public Customer getDobCustomerVaccination() {
        return dobCustomerVaccination;
    }

    public void setDobCustomerVaccination(Customer dobCustomerVaccination) {
        this.dobCustomerVaccination = dobCustomerVaccination;
    }

    public VaccineType getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(VaccineType vaccineType) {
        this.vaccineType = vaccineType;
    }

    public Customer getPreventionVaccinationResult() {
        return preventionVaccinationResult;
    }

    public void setPreventionVaccinationResult(Customer preventionVaccinationResult) {
        this.preventionVaccinationResult = preventionVaccinationResult;
    }

    public int getInjectionCustomer() {
        return injectionCustomer;
    }

    public void setInjectionCustomer(int injectionCustomer) {
        this.injectionCustomer = injectionCustomer;
    }

    public Date getDateOfInjection() {
        return dateOfInjection;
    }

    public void setDateOfInjection(Date dateOfInjection) {
        this.dateOfInjection = dateOfInjection;
    }

    public Date getNextInjectionAppointment() {
        return nextInjectionAppointment;
    }

    public void setNextInjectionAppointment(Date nextInjectionAppointment) {
        this.nextInjectionAppointment = nextInjectionAppointment;
    }
}
