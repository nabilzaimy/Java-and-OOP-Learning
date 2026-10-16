package Revision;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class CinemaSeatingManager {
    public static void main(String[] args){

        // Chapter 35 (2D Arrays), Nested Loops, and User Input.

        // A movie theater manages a seating hall using a 2D grid structure.
        // Customers can view the seating layout, book specific seats by entering row and column coordinates,
        // and watch the system update the matrix in real-time.

        Scanner scanner = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("WELCOME TO CINEMA BOOKING TICKET");
        System.out.println("********************************");
        System.out.println("SEATS POSITION: ");
        System.out.println();

        String[][] myNumbers = { {"[O]" , "[O]", "[O]" , "[O]"},
                                 {"[O]" , "[O]", "[O]" , "[O]"}
                                ,{"[O]" , "[O]", "[O]" , "[O]"}};


        for(int i = 0 ; i < myNumbers.length ; i++){
            for(String number : myNumbers[i]){
                System.out.print(number + " ");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println("CHOOSE YOUR SEAT POSITION =>");
        System.out.print("ROW: ");
        int row = scanner.nextInt();
        System.out.print("COLUMN: ");
        int column = scanner.nextInt();


        scanner.close();
    }
}
