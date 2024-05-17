package com.vaccinmanagement.backend.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "vaccine")
@Data
@Builder
public class Vaccine {

    @Id
    @Column(name = "vaccine_id", length = 10, unique = true, nullable = false)
    private String id;

    @Column(name = "active",nullable = false, unique = true)
    private boolean active;

    @Column(name = "vaccine_name",length = 255, nullable = false, unique = true)
    private String vaccineName;

    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "vaccine_type_code",insertable = false, updatable = false)
    private VaccineType vaccineType;

    @Column(name = "number_of_inject", nullable = false, unique = true)
    private int numberOfInject;

    @Column(name = "prevention", nullable = false, length = 255)
    private String prevention;

    @Column(name = "usage_description", nullable = false,length = 255)
    private String usage;

    @Column(name = "indication", nullable = false, length = 255)
    private String indication;

    @Column(name = "contraindication", nullable = false, length = 255)
    private String contraindication;

    @Column(name = "next_time_start")
    private Date timeOfBeginningNextInjection;

    @Column(name = "next_time")
    private Date timeOfEndingNextInjection;

    @Column(name = "origin", nullable = false, length = 50)
    private String origin;

    @OneToMany(mappedBy = "vaccine",cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<VaccineSchedule> vaccineSchedule;

    public Vaccine() {

    }

    public Vaccine(String id, boolean active, String vaccineName, VaccineType vaccineType, int numberOfInject, String prevention, String usage, String indication, String contraindication, Date timeOfBeginningNextInjection, Date timeOfEndingNextInjection, String origin, Collection<VaccineSchedule> vaccineSchedule) {
        this.id = id;
        this.active = active;
        this.vaccineName = vaccineName;
        this.vaccineType = vaccineType;
        this.numberOfInject = numberOfInject;
        this.prevention = prevention;
        this.usage = usage;
        this.indication = indication;
        this.contraindication = contraindication;
        this.timeOfBeginningNextInjection = timeOfBeginningNextInjection;
        this.timeOfEndingNextInjection = timeOfEndingNextInjection;
        this.origin = origin;
        this.vaccineSchedule = vaccineSchedule;
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

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public VaccineType getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(VaccineType vaccineType) {
        this.vaccineType = vaccineType;
    }

    public int getNumberOfInject() {
        return numberOfInject;
    }

    public void setNumberOfInject(int numberOfInject) {
        this.numberOfInject = numberOfInject;
    }

    public String getPrevention() {
        return prevention;
    }

    public void setPrevention(String prevention) {
        this.prevention = prevention;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public String getContraindication() {
        return contraindication;
    }

    public void setContraindication(String contraindication) {
        this.contraindication = contraindication;
    }

    public Date getTimeOfBeginningNextInjection() {
        return timeOfBeginningNextInjection;
    }

    public void setTimeOfBeginningNextInjection(Date timeOfBeginningNextInjection) {
        this.timeOfBeginningNextInjection = timeOfBeginningNextInjection;
    }

    public Date getTimeOfEndingNextInjection() {
        return timeOfEndingNextInjection;
    }

    public void setTimeOfEndingNextInjection(Date timeOfEndingNextInjection) {
        this.timeOfEndingNextInjection = timeOfEndingNextInjection;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Collection<VaccineSchedule> getVaccineSchedule() {
        return vaccineSchedule;
    }

    public void setVaccineSchedule(Collection<VaccineSchedule> vaccineSchedule) {
        this.vaccineSchedule = vaccineSchedule;
    }
}
