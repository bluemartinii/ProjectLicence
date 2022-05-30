package com.example.ProjectLicence.controller;

import com.example.ProjectLicence.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static com.example.ProjectLicence.model.VehicleReq.*;

@RestController
@RequestMapping(path = "/v1")
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService vehicleService;

    @GetMapping(name = "get-vehicle-info", path = "/vehicle")
    public ResponseEntity<VehicleDto> getVehicle(@RequestBody @Valid VehicleRequest vehicleRequest) {
        return new ResponseEntity<>(vehicleService.getVehicle(vehicleRequest), HttpStatus.OK);
    }

    @GetMapping(name = "get-all-vehicle", path = "/vehicle/list")
    public ResponseEntity<List<VehicleDto>> getAllVehicles(){
        return new ResponseEntity<>(vehicleService.getAllVehicles(), HttpStatus.OK);
    }
}
