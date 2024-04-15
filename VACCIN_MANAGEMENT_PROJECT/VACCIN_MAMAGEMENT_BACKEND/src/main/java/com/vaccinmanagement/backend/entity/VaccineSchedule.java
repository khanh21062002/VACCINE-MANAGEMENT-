package com.vaccinmanagement.backend.entity;


import com.vaccinmanagement.backend.enums.Status;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "vaccine_schedule")
public class VaccineSchedule {

    @Id
    @Column(name = "id_vaccine_schedule")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVaccineSchedule;

    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "vaccine_id",insertable = false, updatable = false)
    private Vaccine vaccine;

    @Column(name = "calendar_from", nullable = false)
    private Date from;

    @Column(name = "calendar_to", nullable = false)
    private Date to;

    @Column(name = "place", length = 255, nullable = false)
    private String place;

    @Column(name = "note", length = 255)
    private String note;

    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private Status status;

    public VaccineSchedule() {}

    public VaccineSchedule(int idVaccineSchedule, Vaccine vaccine, Date from, Date to, String place, String note, Status status) {
        this.idVaccineSchedule = idVaccineSchedule;
        this.vaccine = vaccine;
        this.from = from;
        this.to = to;
        this.place = place;
        this.note = note;
        this.status = status;
    }

    public int getIdVaccineSchedule() {
        return idVaccineSchedule;
    }

    public void setIdVaccineSchedule(int idVaccineSchedule) {
        this.idVaccineSchedule = idVaccineSchedule;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
