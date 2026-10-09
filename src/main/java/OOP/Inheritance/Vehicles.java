package OOP.Inheritance;

public class Vehicles {

    String  type = "SUV";
    String brand = "Toyota";

    void go(){
        System.out.println("This " + brand + " " + type + " is moving");
    }

    void stop(){
        System.out.println("This " + brand + " " + type + " is stopping");
    }
}
