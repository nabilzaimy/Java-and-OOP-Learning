package JavaBasic.ControlFlow;

import java.util.Scanner;

public class WeightConverter {

    public static void main(String[] args){

       // WEIGHT CONVERSION PROGRAM

       double weight;
       double newWeight;
       int choice;

       Scanner scanner = new Scanner(System.in);

       System.out.println("Welcome to weight converter calculator !");

        System.out.println("CHOOSE YOUR OPTION");
        System.out.println("OPTION 1 - KG -> LBS");
        System.out.println("OPTION 2 - LBS -> KG");

        System.out.print("OPTION: ");
        choice = scanner.nextInt();

        if(choice == 1){

            System.out.print("Enter Weight in KG: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.205;
            System.out.println(weight + "KG in LBS is: " + newWeight + "LBS");

        }
        else if(choice == 2){

            System.out.print("Enter Weight in LBS: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453;
            System.out.print(weight);
            System.out.printf("%.2f ", newWeight);
        }
        else{

            System.out.println("You Enter The Wrong Choice");
        }

        scanner.close();


        // option 1 convert kgs oto lbs

       // option 2 convert lbs to kgs

        // else print not valid choice



    }
}
