package JavaBasic.ControlFlow;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args){

        // creating converter using ternary operator

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String option;

        System.out.println("Input Your Temperature: ");
        temp = scanner.nextDouble();

        System.out.println("Convert to Celcius or Fahrenheit ? (C/F)");
        option = scanner.next().toUpperCase();

        newTemp = (option == "C") ? (temp - 32) * 5/9 : (temp * 5/9) + 32;
        System.out.printf("Temperature in %.2f%s", newTemp , option);

        scanner.close();
    }
}
