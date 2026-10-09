package OOP.ClassesAndObjects;

public class DeliveryVan {

    String driverName = "Unassigned";
    int batteryLevel = 100;
    double totalMiles = 0.0;
    boolean isEngineOn = false;

    void startEngine() {
        if (!isEngineOn) {
            isEngineOn = true;
            System.out.println(driverName + "'s van engine started.");
        } else {
            System.out.println("Engine is already running.");
        }
    }

    void drive(double miles) {
        if (!isEngineOn) {
            System.out.println("Cannot drive! Start the engine first.");
        } else if (batteryLevel <= 10) {
            System.out.println("Battery too low to drive! Please recharge.");
        } else {
            totalMiles += miles;
            batteryLevel -= 15;
            System.out.println("Drove " + miles + " miles. Battery remaining: " + batteryLevel + "%.");
        }
    }

    void recharge(){
        if(batteryLevel == 100){
            System.out.println("Van Fully Recharged");
        }
    }
}
