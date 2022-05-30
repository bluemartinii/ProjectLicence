package com.example.ProjectLicence.repository;

import com.example.ProjectLicence.model.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    Vehicle findByPlate(String plate);

    Vehicle findFirstByOrderByPassDateDesc();
}
