package OOP.Constructors;

public class Vehicle {

    String make;
    String model;
    int year;
    double dailyRate;

    Vehicle(){
        this.make = "unknown";
        this.model = "unknown";
        int year = 2024;
        double dailyRate = 0.0;
        System.out.println("This Vehicle is " + year + " olds");
        System.out.println("The daily rate for this is " + dailyRate);
    }

    Vehicle(String make, String model){
        int year = 2024;
        double dailyRate = 50.0;
        this.make = make;
        this.model = model;
        System.out.println("This Vehicle is " + year + " olds");
        System.out.println("The daily rate for this is " + dailyRate);

    }

    Vehicle(String make, String model , int year){
        double dailyRate = 50.0;
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("The daily rate for this is " + dailyRate);
    }

    Vehicle(String make, String model , int year , double dailyRate){

        this.make = make;
        this.model = model;
        this.year = year;
        this.dailyRate = dailyRate;
    }
}
