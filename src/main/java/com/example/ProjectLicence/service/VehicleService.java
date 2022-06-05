package com.example.ProjectLicence.service;

import com.example.ProjectLicence.dto.PenaltyRequest;
import com.example.ProjectLicence.model.VehicleReq;
import com.example.ProjectLicence.model.entity.Penalty;

import java.util.List;

public interface VehicleService {
    VehicleReq.VehicleDto getVehicle(VehicleReq.VehicleRequest vehicleRequest);

    List<VehicleReq.VehicleDto> getAllVehicles();

    VehicleReq.VehicleDto getLastVehicle();

    VehicleReq.VehicleDto updateVehicleFine(PenaltyRequest penaltyRequest);

    List<Penalty> trafficPenalty();
}
