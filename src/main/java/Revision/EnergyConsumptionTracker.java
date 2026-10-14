package Revision;

import java.util.Scanner;

public class EnergyConsumptionTracker {
    public static void main(String[] args){

        // CHAPTERS 31 (ARRAYS), 32 (USER INPUT INTO ARRAYS), 34 (VARARGS), ALONGSIDE BASIC FOR LOOPS.

        // A smart home utility monitor logs your daily electricity consumption (in kilowatt-hours) across a 7-day week
        // , uses a user-input array loop to record them,
        // and utilizes varargs to calculate the average for any arbitrary batch of tracking days.

        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double[] energy = new double[7];

        for(int i = 0 ; i < energy.length ; i++){
            System.out.println("Enter Daily Consumption (kw/j) day(" + (i+1) + "): ");
            energy[i] = scanner.nextDouble();
            sum = sum + energy[i];
        }

        for(double listEnergy : energy){
            System.out.println("***ENERGY CONSUMPTION FOR 7 DAYS***");
            System.out.println(listEnergy);
        }

        System.out.println("ENERGY CONSUMTPTION FOR THIS WEEK: " + sum);
        System.out.println(calculateAverageConsumption(energy));


    }

    static double calculateAverageConsumption(double... energy){
        double sum = 0;
        for(double average : energy){
            sum += average;
        }
        return sum/energy.length;
    }
}
