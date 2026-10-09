package JavaBasic.Arrays;

import java.util.Scanner;

public class Tempreature {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.print("How many days of temperature would you like to record: ");
        size = scanner.nextInt();
        scanner.nextLine();

        double[] temperature = new double[size];

        for(int i=0 ; i < temperature.length ; i++){

            System.out.println("Enter temperature for day " + i+1 + ".");
            temperature[i] = scanner.nextDouble();
        }

        for(int i = 0 ; i < temperature.length ; i++){

            System.out.println("Day" + i+1 + ": " + temperature[i]);
        }


    }
}
