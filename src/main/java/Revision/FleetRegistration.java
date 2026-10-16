package Revision;

import DynamicPolymorphism.Dog;

import java.util.Scanner;

public class FleetRegistration {

    // Chapters 39 (OOP), 40 (Constructors), 41 (Overloaded Constructors),
    // alongside basic classes and methods.

    // Real-World Scenario: A car rental agency wants to manage its basic fleet inventory.
    // You need to create a blueprint class using modern object-oriented principles,
    // instantiate individual vehicles using constructors, and print out their formatted details.

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Car Brand: ");
        String brand = scanner.nextLine().toUpperCase();

        System.out.print("Enter Car Model: ");
        String model = scanner.nextLine().toUpperCase();

        System.out.print("Enter Daily Rate: RM");
        double dailyRate = scanner.nextDouble();

        Vehicle vehicle1 = new Vehicle("Toyota", "Corolla", 50.0);
        Vehicle vehicle2 = new Vehicle(brand , model , dailyRate);

        System.out.println("VEHICLE DEFAULT: " + vehicle1.model + " " + vehicle1.brand + " RM" + vehicle1.dailyRate);
        vehicle1.go();
        System.out.println("VEHICLE 2: " + vehicle2.model + " " + vehicle2.brand + " RM" + vehicle2.dailyRate);
        vehicle2.go();

        scanner.close();
    }
}
