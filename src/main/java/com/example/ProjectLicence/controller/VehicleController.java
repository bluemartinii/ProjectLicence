package com.example.ProjectLicence.controller;

import com.example.ProjectLicence.dto.PenaltyRequest;
import com.example.ProjectLicence.model.entity.Penalty;
import com.example.ProjectLicence.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.ProjectLicence.model.VehicleReq.*;

@RestController
@RequestMapping(path = "/v1")
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService vehicleService;

    @GetMapping(name = "get-vehicle-info", path = "/vehicle")
    public ResponseEntity<VehicleDto> getVehicle(@RequestBody VehicleRequest vehicleRequest) {
        return new ResponseEntity<>(vehicleService.getVehicle(vehicleRequest), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(name = "get-all-vehicle", path = "/vehicle/list")
    public ResponseEntity<List<VehicleDto>> getAllVehicles(){
        return new ResponseEntity<>(vehicleService.getAllVehicles(), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(name = "get-last-vehicle", path = "/vehicle/one")
    public ResponseEntity<VehicleDto> getLastVehicle(){
        return new ResponseEntity<>(vehicleService.getLastVehicle(), HttpStatus.OK);
    }

    @CrossOrigin
    @PutMapping(name = "update-vehicle-fine", path = "/vehicle/fine")
    public ResponseEntity<VehicleDto> updateVehicleFine(@RequestBody PenaltyRequest penaltyRequest){
        return new ResponseEntity<>(vehicleService.updateVehicleFine(penaltyRequest), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(name = "traffic-penalty", path = "/vehicle/penalty")
    public ResponseEntity<List<Penalty>> trafficPenalty(){
        return new ResponseEntity<>(vehicleService.trafficPenalty(), HttpStatus.OK);
    }
}
