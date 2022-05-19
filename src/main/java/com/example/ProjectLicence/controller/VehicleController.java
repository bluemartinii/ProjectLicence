package com.example.ProjectLicence.controller;

import com.example.ProjectLicence.model.VehicleReq;
import com.example.ProjectLicence.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.example.ProjectLicence.model.VehicleReq.*;

@RestController
@RequestMapping(path = "/v1")
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService vehicleService;

    @GetMapping(name = "get-vehicle-info", path = "/vehicle")
    public VehicleDto getVehicle(@RequestBody @Valid VehicleRequest vehicleRequest) {
        return vehicleService.getVehicle(vehicleRequest);
    }
}
