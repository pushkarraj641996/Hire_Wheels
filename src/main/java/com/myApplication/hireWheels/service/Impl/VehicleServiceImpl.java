package com.myApplication.hireWheels.service.Impl;

import com.myApplication.hireWheels.DAO.VehicleCategoryDAO;
import com.myApplication.hireWheels.DAO.VehicleDAO;
import com.myApplication.hireWheels.entities.Vehicle;
import com.myApplication.hireWheels.entities.VehicleCategory;
import com.myApplication.hireWheels.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleDAO _vehicleDAO;

    @Autowired
    private VehicleCategoryDAO _vehicleCategoryDAO;
    @Override
    public void addVehicle(Vehicle vehicle) {
        _vehicleDAO.save(vehicle);
    }

    @Override
    public boolean deleteVehicle(int vehicleID) {
        Vehicle vehicle = getVehicleDetailsByID(vehicleID);

        if ( vehicle != null ) {
            _vehicleDAO.delete(vehicle);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean updateVehicleAvailability(int vehicleID, boolean isAvailable) {
        Vehicle vehicle = getVehicleDetailsByID(vehicleID);

        if ( vehicle != null ) {
            vehicle.setAvailable(isAvailable);
            _vehicleDAO.save(vehicle);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Vehicle getVehicleDetailsByID(int vehicleID) {
        return _vehicleDAO.findById(vehicleID).get();
    }

    @Override
    public List<Vehicle> getAllVehiclesList() {
        List<Vehicle> vehicleList = new LinkedList<>();
        vehicleList = _vehicleDAO.findAll();
        return vehicleList;
    }

    @Override
    public List<Vehicle> getAllAvailableVehicles(String category, Date pickupDate, Date dropOffDate, int locationID) {
        List<VehicleCategory> availableVehiclesList = new LinkedList<>();
        availableVehiclesList = _vehicleCategoryDAO.findByName(category);
        return null;
    }
}
