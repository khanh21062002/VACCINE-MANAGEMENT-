package com.vaccinmanagement.backend.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Vaccine")
public class Vaccine {

    @Id
    @Column(name = "vaccine_id", length = 10, nullable = false, unique = true)
    private String id;

    @Column(name = "active",nullable = false, unique = true)
    private boolean active;

    @Column(name = "vaccine_name",length = 255, nullable = false, unique = true)
    private String vaccine_name;

    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "vaccine_type_ìd",insertable = false, updatable = false)
    private VaccineType vaccineType;

    @Column(name = "number_of_inject", nullable = false, unique = true)
    private int number_of_inject;

    @Column(name = "prevention", nullable = false, length = 255)
    private String prevention;

    @Column(name = "usage",length = 255)
    private String usage;

    @Column(name = "indication", length = 255)
    private String Indication;

    @Column(name = "Contraindication", length = 255)
    private String Contraindication;

    @Column(name = "NextTimeStart")
    private Date time_of_beginning_next_injection;

    @Column(name = "NextTime")
    private Date time_of_ending_next_injection;

    @Column(name = "origin", length = 50)
    private String origin;

    @OneToOne(mappedBy = "Vaccine",cascade = CascadeType.ALL,orphanRemoval = true)
    private VaccineSchedule vaccine_schedule;

    public Vaccine() {

    }

    public Vaccine(String id, boolean active, String vaccine_name, VaccineType vaccineType, int number_of_inject, String usage, String indication, String contraindication, Date time_of_beginning_next_injection, Date time_of_ending_next_injection, String origin, VaccineSchedule vaccine_schedule) {
        this.id = id;
        this.active = active;
        this.vaccine_name = vaccine_name;
        this.vaccineType = vaccineType;
        this.number_of_inject = number_of_inject;
        this.usage = usage;
        Indication = indication;
        Contraindication = contraindication;
        this.time_of_beginning_next_injection = time_of_beginning_next_injection;
        this.time_of_ending_next_injection = time_of_ending_next_injection;
        this.origin = origin;
        this.vaccine_schedule = vaccine_schedule;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getVaccine_name() {
        return vaccine_name;
    }

    public void setVaccine_name(String vaccine_name) {
        this.vaccine_name = vaccine_name;
    }

    public VaccineType getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(VaccineType vaccineType) {
        this.vaccineType = vaccineType;
    }

    public int getNumber_of_inject() {
        return number_of_inject;
    }

    public void setNumber_of_inject(int number_of_inject) {
        this.number_of_inject = number_of_inject;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getIndication() {
        return Indication;
    }

    public void setIndication(String indication) {
        Indication = indication;
    }

    public String getContraindication() {
        return Contraindication;
    }

    public void setContraindication(String contraindication) {
        Contraindication = contraindication;
    }

    public Date getTime_of_beginning_next_injection() {
        return time_of_beginning_next_injection;
    }

    public void setTime_of_beginning_next_injection(Date time_of_beginning_next_injection) {
        this.time_of_beginning_next_injection = time_of_beginning_next_injection;
    }

    public Date getTime_of_ending_next_injection() {
        return time_of_ending_next_injection;
    }

    public void setTime_of_ending_next_injection(Date time_of_ending_next_injection) {
        this.time_of_ending_next_injection = time_of_ending_next_injection;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public VaccineSchedule getVaccine_schedule() {
        return vaccine_schedule;
    }

    public void setVaccine_schedule(VaccineSchedule vaccine_schedule) {
        this.vaccine_schedule = vaccine_schedule;
    }
}
