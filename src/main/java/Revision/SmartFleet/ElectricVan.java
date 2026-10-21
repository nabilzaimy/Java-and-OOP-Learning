package Revision.SmartFleet;

public class ElectricVan extends DeliveryVehicle {

    public ElectricVan(String vehicle, double fee, double distance, boolean isToll) {
        super(vehicle, fee, distance, isToll); // Uses super to pass to parent constructor
    }

    @Override
    void calculateRoute() {
        double totalCost = fee * distance; // Fixed missing multiplication operator
        System.out.println("--- " + vehicle + " ---");
        System.out.println("Route: City Roads (Low-emission zone)");
        System.out.printf("Total Cost: RM %.2f (Toll status: %s)%n%n", totalCost, isToll);
    }
}