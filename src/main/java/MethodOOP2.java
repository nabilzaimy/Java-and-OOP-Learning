public class MethodOOP2 {

    public static void main(String[] args){

        // Learning 1: Java Metohds (Excercise)

        String driverName = "Alex";
        double distance = 12.5;
        double rate = 1.50;
        double tip = 3.00;

        calculateFare(distance , rate);
        printTripSummary(driverName , calculateFare(distance , rate) , tip);
    }

    static double calculateFare(double distanceInMiles , double ratePerMile){

        double totalFare = distanceInMiles * ratePerMile;
        return totalFare;
    }

    static void printTripSummary(String driverName , double totalFare , double tipAmount){

        double finalPayment = totalFare + tipAmount;
        System.out.println("Driver Name: " + driverName);
        System.out.println("Base Ride Fare: " + totalFare);
        System.out.println("Tip: $" + tipAmount);
        System.out.println("Final Payment: $" + finalPayment);
    }
}
