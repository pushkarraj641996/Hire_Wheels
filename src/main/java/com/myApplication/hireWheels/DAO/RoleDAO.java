package com.myApplication.hireWheels.DAO;

import com.myApplication.hireWheels.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDAO extends JpaRepository<Role, Integer> {
}
