public class MethodOOP1 {

    public static void main(String[] args){

        // Learning 1: Java Metohds

        String itemName = "Mechanical Keyboard";
        double price = 89.99;
        double taxRate = 0.06;

        double calculatedTax = calculateTax(price , taxRate);
        printReceipt(itemName, price , calculatedTax);
    }

    static double calculateTax(double price , double taxRate){
        double totalTaxAmount = price * taxRate;
        return totalTaxAmount;
    }
    static void printReceipt(String itemName , double itemPrice , double totalTax){

        double totalDue = itemPrice + totalTax;
        System.out.println("Item Purchased: " + itemName);
        System.out.println("Original Price: " + itemPrice);
        System.out.println("Tax: " + totalTax);
        System.out.println("Total Due: " + totalDue);
    }
}