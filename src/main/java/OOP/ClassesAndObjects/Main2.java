package OOP.ClassesAndObjects;

public class Main2 {

    public static void main(String[] args){

        DeliveryVan vanA = new DeliveryVan();
        DeliveryVan vanB = new DeliveryVan();

        vanA.driverName = "Alex";
        vanB.driverName = "Sam";

        vanA.drive(12.5);
        vanA.startEngine();

        vanB.startEngine();
        vanB.drive(45.0);
        vanB.recharge();

        }
}
