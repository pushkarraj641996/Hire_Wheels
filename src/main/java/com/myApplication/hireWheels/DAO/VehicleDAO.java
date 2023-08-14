package com.myApplication.hireWheels.DAO;

import com.myApplication.hireWheels.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleDAO extends JpaRepository<Vehicle, Integer> {
}
