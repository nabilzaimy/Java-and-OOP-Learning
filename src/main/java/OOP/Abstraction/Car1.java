package OOP.Abstraction;

public class Car1 extends Vehicle1{

    public Car1(String licensePlate , double baseFee){
        super(licensePlate,baseFee);
    }

    @Override
    public double calculateToll(){
        return this.baseFee;
    }
}
