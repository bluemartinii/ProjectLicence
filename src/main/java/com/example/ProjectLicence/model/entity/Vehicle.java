package com.example.ProjectLicence.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Vehicle {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String plate;

    private Date maintenanceDate;

    private Boolean isPenalty;

    private Integer penaltyAmount;

    @ManyToMany
    private List<Penalty> penalties;

    private Date penaltyDate;

    private String name;

    private String surname;

    private String brand;

    private String model;

    private String productionYear;

    private String vehicleType;

    private Date passDate;
}
