package Revision;

import java.util.Scanner;

public class ParkingReceiptSystem {

    public static void main(String[] args){

//        [CHAPTER 5-10]
//
//        An automated parking garage calculates parking fees
//        based on hours parked, applies a flat tax rate, formats financial outputs neatly
//        using printf, and extracts vehicle code details using basic string methods.

        String plateNum;
        double hours;
        double baseFee = 5.00;
        double taxFee;
        double price;
        double totalPrice;
        double tax = 0.06;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Plate Number: ");
        plateNum = scanner.nextLine();
        String plateNumNew = plateNum.replace(" ", "").toUpperCase();

        System.out.print("Enter Hours Park: ");
        hours = scanner.nextDouble();

        price = Math.round(hours) * baseFee;
        taxFee = price * tax;
        totalPrice = price + taxFee;

        System.out.println("Plate Number: " + plateNumNew);
        System.out.println("Plate Number Length: " + plateNumNew.length());
        System.out.println("Total Price: " + totalPrice);

        scanner.close();
    }
}
