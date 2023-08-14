package com.myApplication.hireWheels.DAO;

import com.myApplication.hireWheels.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDAO extends JpaRepository<Booking, Integer> {
}
