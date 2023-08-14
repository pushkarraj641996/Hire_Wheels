package com.myApplication.hireWheels.DAO;

import com.myApplication.hireWheels.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDAO extends JpaRepository<City, Integer> {
}
