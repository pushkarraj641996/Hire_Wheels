package com.myApplication.hireWheels.entities;

import java.util.Set;
import jakarta.persistence.*;

@Entity(name = "vehicle_category")
public class VehicleCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "vehicle_category_name", length = 50, nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "vehicleCategory", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<VehicleSubCategory> vehicleSubCategoryList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<VehicleSubCategory> getVehicleSubCategoryList() {
        return vehicleSubCategoryList;
    }

    public void setVehicleSubCategoryList(Set<VehicleSubCategory> vehicleSubCategoryList) {
        this.vehicleSubCategoryList = vehicleSubCategoryList;
    }

    @Override
    public String toString() {
        return "VehicleCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
