package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VehicleModel {
    private String vehicleId;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String vehicleName;
    private String model;
    private double price;
}