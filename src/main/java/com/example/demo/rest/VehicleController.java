package com.example.demo.rest;


import com.example.demo.model.VehicleModel;
import com.example.demo.service.VehicleService;
import com.example.demo.shared.VehicleRequestModel;
import com.example.demo.shared.VehicleResponseModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VehicleController {

    private VehicleService vehicleservice;

    @Autowired
    public VehicleController(VehicleService vehicleservice) {

        this.vehicleservice = vehicleservice;
    }

    @PostMapping("/vehicles")
    public ResponseEntity<VehicleResponseModel> createVehicle(@RequestBody VehicleRequestModel vehicleRequestModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(vehicleservice.createVehicle(vehicleRequestModel));

    }
    @GetMapping("/vehicles")
    public ResponseEntity<List<VehicleModel>> getAllVehicles()
    {
        return ResponseEntity.ok(vehicleservice.getAllVehicles());
    }



}
