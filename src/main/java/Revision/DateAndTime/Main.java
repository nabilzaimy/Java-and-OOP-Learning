package Revision.DateAndTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Chapter 62: Dates & Times

        // You are building an automated task scheduler for a local delivery company in Kajang.
        // The system needs to log the exact moment an online order is placed, calculate the estimated delivery time
        // by adding 3 business days to the current date, and format the final confirmation timestamp neatly
        // (e.g., dd-MM-yyyy HH:mm:ss) to display to the customer.

        Scanner scanner = new Scanner(System.in);

        System.out.println("*** WELCOME TO ALIAA DELIVERY MANIAC! ***");
        System.out.print("ENTER THE ITEM WEIGHT: ");
        double itemWeight = scanner.nextDouble();


        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = localDateTime.format(formatter1);

        LocalDateTime specificDate1 = LocalDateTime.now();
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime deliver1 = specificDate1.plusDays(3);
        String formatted3 = deliver1.format(formatter3);

        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/New_York"));
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z (VV)").
                withZone(ZoneId.of("Asia/Tokyo"));
        String formattedDate2 = now.format(formatter2);


        System.out.println();

        System.out.println("---------------------------------");
        System.out.println("ITEM WEIGHT: " + itemWeight + "kg");
        System.out.println("PURCHASED TIMESTAMP: " + formattedDate);
        System.out.println("PURCHASED TIMESTAMP ZONE: " + formattedDate2);

        System.out.println("---------------------------------");
        System.out.println("EXPECTED DELIVERY: " + formatted3);

        scanner.close();
    }
}
