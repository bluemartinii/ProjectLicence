package com.example.ProjectLicence.service;

import com.example.ProjectLicence.model.VehicleReq;

import java.util.List;

public interface VehicleService {
    VehicleReq.VehicleDto getVehicle(VehicleReq.VehicleRequest vehicleRequest);

    List<VehicleReq.VehicleDto> getAllVehicles();
}
