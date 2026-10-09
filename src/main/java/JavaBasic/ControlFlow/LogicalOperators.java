package JavaBasic.ControlFlow;

import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Are You a VIP? (true/false): ");
        boolean isVip = scanner.nextBoolean();

        System.out.println("Total Purchase: RM ");
        double orderTotal = scanner.nextDouble();

        System.out.println("Do You Live in Domestic region? (true/false): ");
        boolean isDomestic = scanner.nextBoolean();

        if(isVip || orderTotal >= 50 && isDomestic){
            System.out.println("You are eligible for free shipping !");
        }
        else{
            System.out.println("You are NOT eligible for free shipping !");
        }

        scanner.close();
    }
}
