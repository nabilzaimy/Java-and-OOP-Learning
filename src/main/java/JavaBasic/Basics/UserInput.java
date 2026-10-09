package JavaBasic.Basics;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double total;

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Cup Size [Large/Medium]: ");
        String size = scanner.nextLine();

        System.out.print("Unit Price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        total = quantity * unitPrice;

        System.out.println("********RECEIPT********");
        System.out.println("Customer Name: " + name);
        System.out.println("Cup Size: " + size);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + total);
        System.out.println("********RECEIPT********");

        scanner.close();
    }
}