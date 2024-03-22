package com.alphaautoworks.Model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name= "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String province;
    private String postal_code;
    private String phone_number;
    private String email;
    private String customer_notes;
    private boolean deleted;




}
