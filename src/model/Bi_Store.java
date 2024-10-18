/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */

import java.util.ArrayList;
import java.util.List;

public class Bi_Store {
    private List<Bicycle> bicycles;

    // Constructor
    public Bi_Store() {
        this.bicycles = new ArrayList<>();
    }

    // Load bicycles from file (pseudo code, needs actual implementation)
    public void loadBicyclesFromFile(String filePath) {
        // Implement file reading logic here, skipping invalid entries.
    }

    // Add a bicycle to the list
    public void addBicycle(Bicycle bicycle) {
        bicycles.add(bicycle);
    }

    // Delete a bicycle by bicycleId
    public boolean deleteBicycle(String bicycleId) {
        return bicycles.removeIf(b -> b.getBicycleId().equals(bicycleId));
    }

    // Search for the bicycle with the least time to move (timetomove = distance / speed)
    public Bicycle searchLeastTimeToMove() {
        return bicycles.stream()
                .min((b1, b2) -> Double.compare(b1.getDistance() / b1.getSpeed(), b2.getDistance() / b2.getSpeed()))
                .orElse(null);
    }

    // Print list of bicycles
    public void printBicycles() {
        bicycles.forEach(System.out::println);
    }

    // Print list of bicycles by production year
    public void printBicyclesByYear(int year) {
        bicycles.stream()
                .filter(b -> b.getProductionDate().getYear() == year)
                .forEach(System.out::println);
    }
}

