package Revision;

import java.util.Scanner;

public class InventorySKULookup {
    public static void main(String[] args) {

        // CHAPTER 31 (ARRAYS), CHAPTER 33 (SEARCHING AN ARRAY),
        // CHAPTERS 21/24 (WHILE LOOPS & CONDITIONAL FLOW CONTROL).

        String[] codes = {"SKU-101", "SKU-205", "SKU-310", "SKU-412", "SKU-500"};

        Scanner scanner = new Scanner(System.in);

        // Outer loop to keep the program running continuously
        while (true) {
            System.out.print("\nENTER SKU CODE (or type 'QUIT' to exit): ");
            String target = scanner.nextLine().toUpperCase();

            // Check if user wants to quit
            if (target.equals("QUIT")) {
                System.out.println("QUIT SYSTEM!");
                break;
            }

            boolean found = false;

            // Inner loop: Scans through the entire array for the target
            for (int i = 0; i < codes.length; i++) {
                if (target.equals(codes[i])) {
                    System.out.println("ITEM CODE: " + codes[i] + " FOUND!");
                    System.out.printf("CATALOG INDEX: %d \n", i);
                    found = true;
                    break; // Exit the for loop early since we found a match
                }
            }

            // If the loop finished scanning all elements and 'found' is still false
            if (!found) {
                System.out.println("ITEM CODE: " + target + " NOT FOUND!");
            }
        }

        scanner.close();
    }
}