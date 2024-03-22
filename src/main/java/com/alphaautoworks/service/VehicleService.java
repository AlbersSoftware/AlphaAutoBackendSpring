package com.alphaautoworks.service;

import com.alphaautoworks.Model.Vehicle;
import com.alphaautoworks.doa.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle getVehicleById(int id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Vehicle updateVehicle(int id, Vehicle updatedVehicle) {
        if (vehicleRepository.existsById(id)) {
            updatedVehicle.setId(id);
            return vehicleRepository.save(updatedVehicle);
        }
        return null;
    }

    public void deleteVehicle(int id) {
        vehicleRepository.deleteById(id);
    }

    public List<Vehicle> getVehiclesByCustomerId(int customerId) {
        System.out.println("Fetching vehicles for customer ID: " + customerId);
        return vehicleRepository.findByCustomerId(customerId);
    }

}

