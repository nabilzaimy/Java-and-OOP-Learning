package Revision.SmartFleet;

public class DeliveryVehicle {
    String vehicle;
    double fee;
    double distance;
    boolean isToll;

    // Parent constructor
    public DeliveryVehicle(String vehicle, double fee, double distance, boolean isToll) {
        this.vehicle = vehicle;
        this.fee = fee;
        this.distance = distance;
        this.isToll = isToll;
    }

    void calculateRoute() {
        System.out.println("Calculating Delivery Route....");
    }
}