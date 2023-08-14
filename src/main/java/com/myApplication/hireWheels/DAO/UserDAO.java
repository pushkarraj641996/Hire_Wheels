package com.myApplication.hireWheels.DAO;

import com.myApplication.hireWheels.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer> {
}
