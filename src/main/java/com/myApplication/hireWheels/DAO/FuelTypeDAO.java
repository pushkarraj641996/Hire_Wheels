package com.myApplication.hireWheels.DAO;

import com.myApplication.hireWheels.entities.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelTypeDAO extends JpaRepository<FuelType, Integer> {
}
