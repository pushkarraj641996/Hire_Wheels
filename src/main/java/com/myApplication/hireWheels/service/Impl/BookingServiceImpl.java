package com.myApplication.hireWheels.service.Impl;

import com.myApplication.hireWheels.DAO.BookingDAO;
import com.myApplication.hireWheels.entities.Booking;
import com.myApplication.hireWheels.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;

public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingDAO _bookingDAO;
    @Override
    public void addBooking(Booking booking) {
        if (booking != null) {
            _bookingDAO.save(booking);
        }
    }

    @Override
    public boolean deleteBooking(int bookingID) {
        Booking booking = _bookingDAO.findById(bookingID).get();

        if ( booking != null ) {
            _bookingDAO.delete(booking);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateBooking(int bookingID, Booking booking) {
        Booking existingBooking = _bookingDAO.findById(bookingID).get();

        if ( existingBooking != null ) {
            existingBooking.setBookingDate(booking.getBookingDate());
            existingBooking.setAmount(booking.getAmount());
            existingBooking.setLocation(booking.getLocation());
            existingBooking.setUser(booking.getUser());
            existingBooking.setDropoffDate(booking.getDropoffDate());
            existingBooking.setPickupDate(booking.getPickupDate());
            existingBooking.setVehicle(booking.getVehicle());

            _bookingDAO.save(existingBooking);
        }
        else {
            addBooking(booking);
        }
        return true;
    }
}
