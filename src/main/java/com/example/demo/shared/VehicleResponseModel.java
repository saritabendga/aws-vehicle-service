package com.example.demo.shared;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VehicleResponseModel {
    private String vehicleId;
    private String vehicleName;
    private String model;
    private double price;

}