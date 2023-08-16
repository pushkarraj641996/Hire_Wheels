package com.myApplication.hireWheels.service.Impl;

import com.myApplication.hireWheels.DAO.UserDAO;
import com.myApplication.hireWheels.entities.User;
import com.myApplication.hireWheels.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO _userDAO;
    @Override
    public void addUser(User user) {
        _userDAO.save(user);
    }

    @Override
    public boolean deleteUser(int userID) {
        User user = _userDAO.findById(userID).get();

        if ( user != null ) {
            _userDAO.delete(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateUser(int userID, User user) {
        User existingUser = _userDAO.findById(userID).get();

        if ( existingUser != null ) {
            existingUser.setEmail(user.getEmail());
            existingUser.setFirstName(user.getEmail());
            existingUser.setRole(user.getRole());
            existingUser.setPassword(user.getPassword());
            existingUser.setLastName(user.getLastName());
            existingUser.setMobNo(user.getMobNo());
            existingUser.setWallet(user.getWallet());
        }
        else {
            addUser(user);
        }
        return true;
    }

    @Override
    public User getUserByID(int userId) {
        return _userDAO.findById(userId).get();
    }
}
