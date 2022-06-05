package com.example.ProjectLicence.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Penalty {
    private String name;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(mappedBy = "penalties")
    List<Vehicle> vehicles;
}
