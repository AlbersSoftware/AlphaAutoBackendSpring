package com.alphaautoworks.doa;

import com.alphaautoworks.Model.Customer;
import com.alphaautoworks.Model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    List<Vehicle> findByCustomerId(int customerId);

}

