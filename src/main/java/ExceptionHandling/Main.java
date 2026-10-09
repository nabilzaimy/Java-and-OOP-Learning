package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program
        //             (Dividing by zero, file not found, mismatch input type)
        //             Surround by dangerous code with a try{} block
        //             try{} , catch{} , finally{}

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter Number");
            int number = scanner.nextInt();
            System.out.println(number);
        }

        catch(InputMismatchException e){
            System.out.println("This is not a number !");
        }

        finally{
            System.out.println("This will always run !");
        }
    }
}