package com.example.demo.shared;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class VehicleRequestModel {

    private String vehicleName;
    private String model;
    private double price;
}
