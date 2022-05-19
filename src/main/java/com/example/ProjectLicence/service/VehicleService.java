package com.example.ProjectLicence.service;

import com.example.ProjectLicence.model.VehicleReq;

public interface VehicleService {
    VehicleReq.VehicleDto getVehicle(VehicleReq.VehicleRequest vehicleRequest);
}
