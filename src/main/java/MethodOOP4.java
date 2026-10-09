import java.util.Scanner;

public class MethodOOP4 {

    public static void main(String[] args){

        // Learning 2: Overloaded Methods Excercise

        Scanner scanner = new Scanner(System.in);


        System.out.println("What Types of Pays? ");
        System.out.println("1 - Standard Checkout");
        System.out.println("2 - Checkout with Promo Code");
        System.out.println("3 - Checkout with Sales Tax & Shipping");
        System.out.println("");
        System.out.println("What Types of Pays? [Enter Number]: ");
        int types = scanner.nextInt();

        if(types == 1){
            System.out.println("Enter Price: ");
            double totalPrice = scanner.nextDouble();
            System.out.println("Total Price: " + calculateTotal(totalPrice));
        }
        else if(types == 2){
            System.out.println("Enter Price: ");
            double price = scanner.nextDouble();

            System.out.println("Enter Discount (%): ");
            double discount = scanner.nextDouble();
            System.out.println("Total Price after Discount: " + calculateTotal(price, discount));
        }
        else{
            System.out.println("Enter Price: ");
            double price = scanner.nextDouble();

            System.out.println("Enter Tax Rate (%): ");
            double taxRate = scanner.nextDouble();

            System.out.println("Enter Shipping Rate (%): ");
            double shipping = scanner.nextDouble();
            System.out.println("Total Price with Tax and Shipping" + calculateTotal(price , taxRate , shipping));
        }
    }

    static double calculateTotal(double price){
        return price;
    }

    static double calculateTotal(double price, double discount){
        double totalPrice = price - (price * (discount/100));
        return totalPrice;
    }

    static double calculateTotal(double price , double taxRate , double shipping){
        double totalPrice = price + (price * (taxRate/100) ) + (price * (shipping/100));
        return totalPrice;
    }
}
