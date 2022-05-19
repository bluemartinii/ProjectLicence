package com.example.ProjectLicence.service.impl;

import com.example.ProjectLicence.exception.VehicleServiceException;
import com.example.ProjectLicence.model.VehicleReq;
import com.example.ProjectLicence.model.entity.Vehicle;
import com.example.ProjectLicence.repository.VehicleRepository;
import com.example.ProjectLicence.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import static com.example.ProjectLicence.util.RegexUtil.validatePlate;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;

    @Override
    public VehicleReq.VehicleDto getVehicle(VehicleReq.VehicleRequest vehicleRequest) {

        /*
        if(!validatePlate(vehicleRequest.getPlate())){
            throw new VehicleServiceException("Plate format is not valid!");
        }

         */

        Vehicle vehicle = vehicleRepository.findByPlate(vehicleRequest.getPlate());

        if(ObjectUtils.isEmpty(vehicle)) {
            throw new VehicleServiceException("Vehicle is not found!");
        }

        return new VehicleReq.VehicleDto(vehicle);
    }



    private String formatPlate(String plate){
        return plate.strip().toUpperCase();
    }
}
