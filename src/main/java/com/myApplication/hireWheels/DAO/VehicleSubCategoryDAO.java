package com.myApplication.hireWheels.DAO;

import com.myApplication.hireWheels.entities.VehicleCategory;
import com.myApplication.hireWheels.entities.VehicleSubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleSubCategoryDAO extends JpaRepository<VehicleSubCategory, Integer> {

    public VehicleCategory findByVehicleCategory()
}
