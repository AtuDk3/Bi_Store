/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */

import java.time.LocalDate;

import java.time.LocalDate;

public class Bicycle {
    private String bicycleId;
    private double speed;
    private double distance;
    private boolean isElectricBicycle;
    private LocalDate productionDate;

    // Constructor
    public Bicycle(String bicycleId, double speed, double distance, boolean isElectricBicycle, LocalDate productionDate) {
        this.bicycleId = bicycleId;
        this.speed = speed;
        this.distance = distance;
        this.isElectricBicycle = isElectricBicycle;
        this.productionDate = productionDate;
    }

    // Getters and Setters
    public String getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(String bicycleId) {
        this.bicycleId = bicycleId;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public boolean isElectricBicycle() {
        return isElectricBicycle;
    }

    public void setElectricBicycle(boolean electricBicycle) {
        isElectricBicycle = electricBicycle;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    // Method to check if the bicycle needs recharging
    public String needToRecharge() {
        if (isElectricBicycle && distance > 60) {
            return "Need to recharge batteries";
        }
        return "Don't need to recharge";
    }

    // Override toString method
    @Override
    public String toString() {
        String prefix = isElectricBicycle ? "E-" : "";
        return String.format("%sBicycle [%s] | %.1f | %.1f | %s | %s", prefix, bicycleId, speed, distance, needToRecharge(), productionDate);
    }
}

