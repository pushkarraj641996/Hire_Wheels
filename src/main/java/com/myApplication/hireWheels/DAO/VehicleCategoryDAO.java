package com.myApplication.hireWheels.DAO;

import com.myApplication.hireWheels.entities.VehicleCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleCategoryDAO extends JpaRepository<VehicleCategory, Integer> {

    public VehicleCategory findByName(String category);

}
