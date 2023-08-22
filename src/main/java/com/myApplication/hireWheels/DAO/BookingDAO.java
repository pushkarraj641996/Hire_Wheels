package com.myApplication.hireWheels.DAO;

import java.util.List;
import com.myApplication.hireWheels.entities.Booking;
import com.myApplication.hireWheels.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDAO extends JpaRepository<Booking, Integer> {
    public List<Booking> findByVehicleWithBooking(Vehicle vehicle);
}
