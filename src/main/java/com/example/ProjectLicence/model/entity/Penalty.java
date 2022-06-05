package com.example.ProjectLicence.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
public class Penalty {
    String name;
    @Id
    Long id;
    @ManyToMany(mappedBy = "penalties")
    List<Vehicle> vehicles;
}
