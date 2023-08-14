package com.myApplication.hireWheels.service;

import com.myApplication.hireWheels.entities.Booking;

public interface BookingService {

    public void addBooking(Booking booking);

    public boolean deleteBooking(int bookingID);

    public boolean updateBooking(int bookingID, Booking booking);
}
