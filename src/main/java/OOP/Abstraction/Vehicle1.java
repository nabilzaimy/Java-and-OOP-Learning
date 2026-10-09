package OOP.Abstraction;

public abstract class Vehicle1 {

    String licensePlate;
    double baseFee;

    Vehicle1(String licensePlate , double baseFee){
        this.licensePlate = licensePlate;
        this.baseFee = baseFee;
    }

    abstract double calculateToll();

    public void printReceipt() {
        System.out.println("----------------------------");
        System.out.println("Vehicle Plate : " + this.licensePlate);
        System.out.println("Total Toll Fee: RM " + calculateToll());
        System.out.println("----------------------------");
    }
}
