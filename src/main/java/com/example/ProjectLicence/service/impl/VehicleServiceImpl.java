package com.example.ProjectLicence.service.impl;

import com.example.ProjectLicence.exception.VehicleServiceException;
import com.example.ProjectLicence.model.VehicleReq;
import com.example.ProjectLicence.model.entity.Vehicle;
import com.example.ProjectLicence.repository.VehicleRepository;
import com.example.ProjectLicence.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

        Vehicle vehicle = vehicleRepository.findByPlate(formatPlate(vehicleRequest.getPlate()));

        if(ObjectUtils.isEmpty(vehicle)) {
            throw new VehicleServiceException("Vehicle is not found!");
        }

        vehicle.setPassDate(new Date());
        vehicleRepository.save(vehicle);

        return new VehicleReq.VehicleDto(vehicle);
    }

    @Override
    public List<VehicleReq.VehicleDto> getAllVehicles(){
        List<VehicleReq.VehicleDto> vehicleResponseList = new ArrayList<>();
        List<Vehicle> vehicleList = vehicleRepository.findAll();

        if(CollectionUtils.isEmpty(vehicleList)){
            throw new VehicleServiceException("Vehicle not found!");
        }

        for(Vehicle vehicle : vehicleList){
            vehicleResponseList.add(new VehicleReq.VehicleDto(vehicle));
        }

        return vehicleResponseList;
    }

    @Override
    public VehicleReq.VehicleDto getLastVehicle(){
        Vehicle vehicle;

        vehicle = vehicleRepository.findFirstByOrderByPassDateDesc();

        if(ObjectUtils.isEmpty(vehicle)){
            throw new VehicleServiceException("Vehicle not found!");
        }

        return new VehicleReq.VehicleDto(vehicle);
    }

    private String formatPlate(String plate){
        return plate.strip().toUpperCase();
    }
}
