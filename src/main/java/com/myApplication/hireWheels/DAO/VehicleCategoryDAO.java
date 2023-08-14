package com.myApplication.hireWheels.DAO;

import com.myApplication.hireWheels.entities.VehicleCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleCategoryDAO extends JpaRepository<VehicleCategory, Integer> {
}
