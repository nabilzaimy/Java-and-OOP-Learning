package Revision.SmartFleet;

public class CargoTruck extends DeliveryVehicle {

    public CargoTruck(String vehicle, double fee, double distance, boolean isToll) {
        super(vehicle, fee, distance, isToll);
    }

    @Override
    void calculateRoute() {
        double totalCost = fee * distance;
        System.out.println("--- " + vehicle + " ---");
        System.out.println("Route: Highway Toll Lanes (Freight Corridor)");
        System.out.printf("Total Cost: RM %.2f (Toll status: %s)%n%n", totalCost, isToll);
    }
}