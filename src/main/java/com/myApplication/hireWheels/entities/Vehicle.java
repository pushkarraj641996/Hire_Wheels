package com.myApplication.hireWheels.entities;

import java.util.Set;
import jakarta.persistence.*;
import org.hibernate.bytecode.internal.bytebuddy.BytecodeProviderImpl;

@Entity(name = "vehicle")
public class Vehicle {

    @Column(name = "vehicle_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iD;

    @Column(name = "vehicle_model", nullable = false)
    private String model;

    @Column(name = "vehicle_number", nullable = false)
    private int number;

    @ManyToOne
    @JoinColumn(name = "vehicle_subcategory_id", nullable = false)
    private VehicleSubCategory subCategory;

    @Column(length = 50, nullable = false)
    private String color;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @ManyToOne
    @JoinColumn(name = "fuel_type_id", nullable = false)
    private FuelType fuelType;

    @Column(name = "availability_status", length = 1, nullable = false)
    private boolean isAvailable;

    @Column(name = "vehicle_image_url", length = 500, nullable = false)
    private String imageURL;

    @OneToMany(mappedBy = "vehicle", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Booking> bookingList;

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public VehicleSubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(VehicleSubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "iD=" + iD +
                ", model='" + model + '\'' +
                ", number=" + number +
                ", subCategory=" + subCategory +
                ", color='" + color + '\'' +
                ", location=" + location +
                ", fuelType=" + fuelType +
                ", isAvailable=" + isAvailable +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
