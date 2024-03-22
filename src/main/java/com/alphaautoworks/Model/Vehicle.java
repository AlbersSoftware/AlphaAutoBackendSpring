package com.alphaautoworks.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name= "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String vin;
    private String make;
    private String model;
    private String color;
    private String year;
    private String odometer;
    private String license;
    @Column(name = "customer_id")
    private int customerId;

    private boolean deleted;

}
