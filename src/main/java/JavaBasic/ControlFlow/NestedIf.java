package JavaBasic.ControlFlow;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int book;
        boolean member = false;
        double totalPrice;
        double discount;
        double price = 10.00;

        System.out.println("How many book you would like to buy?: ");
        book = scanner.nextInt();

        if(book >= 3){

            if(member){

                System.out.println("You have member discount price of 15% off !");
                discount = 0.75;
                totalPrice = (price * book) * discount;
                System.out.printf("Total Price is: %.2f", totalPrice);
            }
            else{

                System.out.println("You get 10% discount off!");
                discount = 0.9;
                totalPrice = (price * book) * discount;
                System.out.printf("Total Price is: %.2f", totalPrice);
            }
        }
        else{

            totalPrice = book * price;
            System.out.printf("Total Price is: %.2f", totalPrice);

        }

        scanner.close();
    }
}
