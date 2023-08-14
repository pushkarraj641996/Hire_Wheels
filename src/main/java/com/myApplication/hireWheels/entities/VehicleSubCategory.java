package com.myApplication.hireWheels.entities;

import java.util.Set;
import jakarta.persistence.*;

@Entity(name = "vehicle_subcategory")
public class VehicleSubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_subcategory_id")
    private int id;

    @Column(name = "vehicle_subcategory_name", length = 50, unique = true, nullable = false)
    private String name;

    @Column(name = "price_per_day", nullable = false)
    private int pricePerDay;

    @ManyToOne
    @JoinColumn(name = "vehicle_category_id", nullable = false)
    private VehicleCategory vehicleCategory;

    @OneToMany(mappedBy = "subCategory", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Vehicle> vehicleList;

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

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    @Override
    public String toString() {
        return "VehicleSubcategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", vehicleCategory=" + vehicleCategory +
                '}';
    }
}
