package com.example.demo.service;


import com.example.demo.dao.VehicleRepository;
import com.example.demo.model.VehicleModel;
import com.example.demo.shared.VehicleRequestModel;
import com.example.demo.shared.VehicleResponseModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
@Service
@EnableTransactionManagement
public class VehicleServiceImpl implements VehicleService{
    private ModelMapper modelMapper;
    private VehicleRepository vehicleRepository;

    public VehicleServiceImpl(ModelMapper modelMapper, VehicleRepository vehicleRepository) {
        this.modelMapper = modelMapper;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    @Transactional
    public VehicleResponseModel createVehicle(VehicleRequestModel vehicleDetails) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        VehicleModel model=modelMapper.map(vehicleDetails,VehicleModel.class);
        model.setVehicleId(UUID.randomUUID().toString());
        VehicleModel response=vehicleRepository.save(model);
        return modelMapper.map(response,VehicleResponseModel.class);
    }

    @Override
    @Transactional
    public List<VehicleModel> getAllVehicles() {
        return vehicleRepository.findAll();
    }
}