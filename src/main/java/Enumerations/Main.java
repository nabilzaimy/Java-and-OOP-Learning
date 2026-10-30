package Enumerations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Chapter 68: Enumerations

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter Day: ");
            String response = scanner.nextLine();
            Day day = Day.valueOf(response.toUpperCase());

            switch (day){
                case MONDAY ,
                     TUESDAY ,
                     WEDNESDAY ,
                     THURSDAY ,
                     FRIDAY -> System.out.println("This is Weekday !");
                case SATURDAY , SUNDAY -> System.out.println("This is Weekend");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid Day");
        }


        scanner.close();
    }
}
