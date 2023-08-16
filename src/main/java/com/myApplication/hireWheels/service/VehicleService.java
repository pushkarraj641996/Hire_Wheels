package com.myApplication.hireWheels.service;

import java.util.List;
import java.util.Date;
import com.myApplication.hireWheels.entities.Vehicle;

public interface VehicleService {

    public void addVehicle(Vehicle vehicle);

    public boolean deleteVehicle(int vehicleID);

    public boolean updateVehicleAvailability(int vehicleID, boolean isAvailable);

    public Vehicle getVehicleDetailsByID(int vehicleID);

    public List<Vehicle> getAllVehiclesList();

    public List<Vehicle> getAllAvailableVehicles(String category, Date pickupDate, Date dropOffDate, int locationID);
}
