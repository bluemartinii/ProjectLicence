package com.example.ProjectLicence.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Vehicle {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String plate;

    private Date maintenanceDate;

    private Boolean isPenalty;

    private Date penaltyDate;

    private String name;

    private String surname;

    private String brand;

    private String model;

    private String productionYear;

    private String vehicleType;
}
