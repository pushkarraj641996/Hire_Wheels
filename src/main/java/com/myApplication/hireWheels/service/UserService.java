package com.myApplication.hireWheels.service;

import com.myApplication.hireWheels.entities.User;

public interface UserService {

    public void addUser(User user);

    public boolean deleteUser(int userID);

    public boolean updateUser(int userID, User user);

    public User getUserByID(int userId);
}
