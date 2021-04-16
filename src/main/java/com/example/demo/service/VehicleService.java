package com.example.demo.service;


import com.example.demo.model.VehicleModel;
import com.example.demo.shared.VehicleRequestModel;
import com.example.demo.shared.VehicleResponseModel;

import java.util.List;

public interface VehicleService {

    public VehicleResponseModel createVehicle(VehicleRequestModel vehicleDetails);

    public List<VehicleModel> getAllVehicles();

}