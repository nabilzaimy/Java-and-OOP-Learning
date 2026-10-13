package Revision;

import java.util.Scanner;

public class AutomatedWarehouseInventory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quit = 0;
        while (!(quit == -1)) {

            System.out.println("**** WEIGHT TRACKING ****");

            System.out.print("INSERT BATCH CODE: ");
            int code = scanner.nextInt();
            scanner.nextLine();

            System.out.print("INSERT ITEM COUNTS: ");
            int itemCount = scanner.nextInt();

            System.out.print("INSERT ITEM WEIGHT: ");
            double itemWeight = scanner.nextDouble();

            System.out.print("ADD FRAGILE PACKAGE OR NO? [Y-yes] [N-no]: ");
            boolean addition = scanner.nextBoolean();

            System.out.println();

            if (code > 0 || code != 999) {
                if(addition){
                    System.out.println("*****WEIGHT BILL*****");
                    System.out.println("BATCH CODE: " + code);
                    System.out.println("TOTAL SHIPPING WEIGHT: " + calculateShippingWeight(itemCount , itemWeight , addition) + "kg");
                }

                else{
                    System.out.println("*****WEIGHT BILL*****");
                    System.out.println("TOTAL SHIPPING WEIGHT: " + calculateShippingWeight(itemCount , itemWeight) + "kg");
                }
            }
            else {
                System.out.println("INVALID CODE: " + code);
                continue;
            }

            System.out.println();
            System.out.println("PRESS ANYTHING TO CONTINUE: ");
            System.out.print("PRESS (-1) TO QUIT: ");
            System.out.println();
            quit = scanner.nextInt();
        }
    }

    static double calculateShippingWeight ( int itemCount, double itemWeight)
    {
        double shippingWeight = itemCount * itemWeight;
        return shippingWeight;
    }

    static double calculateShippingWeight ( int itemCount, double itemWeight, boolean flag)
    {
        if(flag){
            double addition = 1.5;
            double shippingWeight = itemCount * (itemWeight + addition);
            return shippingWeight;
        }
        else{
            double shippingWeight = itemCount * itemWeight;
            return shippingWeight;
        }
    }
}
