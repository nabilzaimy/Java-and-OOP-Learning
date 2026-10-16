package Revision;

public class Vehicle {

    String brand;
    String model;
    double dailyRate;

    Vehicle(String brand, String model, double dailyRate){
        this.brand = brand.toUpperCase();
        this.model = model.toUpperCase();
        this.dailyRate = dailyRate;
    }

    void go(){
        System.out.println("Your " + this.brand + " can drive now");
    }
}
