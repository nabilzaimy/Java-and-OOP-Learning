package JavaBasic.Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class WhileLoop {

    // correct pin = 4-digits
    // attempts = <= 3

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int correctPin = 4321;
        int enteredPin;
        double accountBalance = 500.00;
        int attempts = 0;

        System.out.println("Enter PIN Number: ");
        enteredPin = scanner.nextInt();

        while(enteredPin != correctPin)
        {
            System.out.println("Enter Correct Pin");
        }

        System.out.println("Not Correct!");
        }


    }
