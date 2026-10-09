package OOP.Abstraction;

public class Lorry1 extends Vehicle1{

    int totalAxles;

    public Lorry1(String licensePlate, double baseFee, int totalAxles){
        super(licensePlate,baseFee);
        this.totalAxles = totalAxles;
    }

    @Override
    public double calculateToll() {
        return this.baseFee + (this.totalAxles * 2.00);
    }
}
