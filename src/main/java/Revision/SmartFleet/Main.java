package Revision.SmartFleet;

public class Main {
    public static void main(String[] args) {
        // Chapters Covered: Chapter 42 (Array of Objects), Chapter 51 (Runtime Polymorphism)

        // Creating an Array of Objects using the parent reference type (DeliveryVehicle)
        DeliveryVehicle[] fleet = new DeliveryVehicle[3];

        fleet[0] = new ElectricVan("Electric Van A", 100.0, 15.5, false);
        fleet[1] = new CargoTruck("Heavy Cargo Truck B", 150.0, 42.0, true);
        fleet[2] = new ElectricVan("Electric Van C", 100.0, 8.0, false);

        System.out.println("=== CENTRAL FLEET DISPATCHER ===");

        // Looping through the array: Java dynamically triggers the correct overridden
        // calculateRoute() method at runtime based on whether the object is an ElectricVan or CargoTruck!
        for (DeliveryVehicle vehicle : fleet) {
            vehicle.calculateRoute();
        }
    }
}