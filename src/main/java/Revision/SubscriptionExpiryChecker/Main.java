package Revision.SubscriptionExpiryChecker;

import javax.swing.text.DateFormatter;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


        System.out.println("**** WELCOME TO MEMBERSHIP PLAN ****");
        System.out.print("1 - New Subscription | 2 - Check Subsription Plan: ");
        int choice = scanner.nextInt();

        if(choice == 1) {
            System.out.print("Enter Start Date (Day): ");
            int day = scanner.nextInt();
            System.out.print("Enter Start Date (Month): ");
            int month = scanner.nextInt();
            System.out.print("Enter Start Date (Year): ");
            int year = scanner.nextInt();

            LocalDate startDate = LocalDate.of(year, month, day);
            String formatted = startDate.format(formatter);

            System.out.println("Start Plan Date: " + formatted);
            LocalDate endDate = startDate.plusDays(30);
            System.out.println("End Plan Date: " + endDate);
        }

        else if (choice ==2) {
            System.out.print("Enter Start Date (Day): ");
            int d = scanner.nextInt();
            System.out.print("Enter Start Date (Month): ");
            int m = scanner.nextInt();
            System.out.print("Enter Start Date (Year): ");
            int y = scanner.nextInt();

            LocalDate startDate = LocalDate.of(y,m,d);
            String formatted = startDate.format(formatter);

            System.out.println("Start Plan Date: " + formatted);
            LocalDate endDate = startDate.plusDays(30);
            LocalDate today = LocalDate.now();

            if(today.isAfter(endDate)){
                throw new DateTimeException("Subscription Expired ! Please Renew !");
            }
            else {
                long balanceDays = ChronoUnit.DAYS.between(today,endDate);
                System.out.println("Days Remaining: " + balanceDays + " days");
            }
        }


        scanner.close();
    }
}
