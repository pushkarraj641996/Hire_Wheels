package com.myApplication.hireWheels.entities;

import java.util.Set;
import jakarta.persistence.*;

@Entity(name = "fuel_type")
public class FuelType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fuel_type_id")
    private int fuelTypeID;

    @Column(name = "fuel_type", length = 50, nullable = false)
    private String fuelType;

    @OneToMany(mappedBy = "fuelType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Vehicle> vehicleList;
}
