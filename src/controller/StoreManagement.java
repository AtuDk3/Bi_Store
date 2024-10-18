/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Lenovo
 */

import model.Bi_Store;
import model.Bicycle;

import java.time.LocalDate;
import java.util.Scanner;

public class StoreManagement {
    private Bi_Store store;
    private Scanner scanner;

    public StoreManagement() {
        store = new Bi_Store();
        scanner = new Scanner(System.in);
    }

    // Display the menu
    public void displayMenu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display all bicycles");
            System.out.println("2. Add new bicycle");
            System.out.println("3. Delete a bicycle");
            System.out.println("4. Search for the least time to move");
            System.out.println("5. Print bicycles by production year");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    store.printBicycles();
                    break;
                case 2:
                    addBicycle();
                    break;
                case 3:
                    deleteBicycle();
                    break;
                case 4:
                    Bicycle b = store.searchLeastTimeToMove();
                    if (b != null) {
                        System.out.println("Bicycle with least time to move: " + b);
                    } else {
                        System.out.println("No bicycles available.");
                    }
                    break;
                case 5:
                    System.out.print("Enter production year: ");
                    int year = scanner.nextInt();
                    store.printBicyclesByYear(year);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Add a new bicycle
    private void addBicycle() {
        System.out.print("Enter bicycleId: ");
        String id = scanner.next();
        System.out.print("Enter speed: ");
        double speed = scanner.nextDouble();
        System.out.print("Enter distance: ");
        double distance = scanner.nextDouble();
        System.out.print("Is it an electric bicycle? (true/false): ");
        boolean isElectric = scanner.nextBoolean();
        System.out.print("Enter production date (YYYY-MM-DD): ");
        String date = scanner.next();
        LocalDate productionDate = LocalDate.parse(date);

        Bicycle bicycle = new Bicycle(id, speed, distance, isElectric, productionDate);
        store.addBicycle(bicycle);
        System.out.println("Bicycle added successfully.");
    }

    // Delete a bicycle
    private void deleteBicycle() {
        System.out.print("Enter bicycleId to delete: ");
        String id = scanner.next();
        if (store.deleteBicycle(id)) {
            System.out.println("Bicycle deleted successfully.");
        } else {
            System.out.println("Bicycle not found.");
        }
    }
}

