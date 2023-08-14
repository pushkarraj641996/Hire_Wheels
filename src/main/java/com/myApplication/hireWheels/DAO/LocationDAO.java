package com.myApplication.hireWheels.DAO;

import com.myApplication.hireWheels.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationDAO extends JpaRepository<Location, Integer> {
}
