package OOP.Abstraction;

public class Main12 {

    public static void main(String[] args) {

        // ❌ Cannot instantiate abstract class directly:
        // Vehicle vehicle = new Vehicle("W1234A", 5.00);

        // ✅ Instantiate concrete subclasses:
        Vehicle1 car = new Car1("W1234A", 5.00);
        Vehicle1 lorry = new Lorry1("B5678B", 5.00, 4);

        System.out.println("=== TOLL BOOTH RECEIPTS ===");
        car.printReceipt();
        lorry.printReceipt();
    }
}
