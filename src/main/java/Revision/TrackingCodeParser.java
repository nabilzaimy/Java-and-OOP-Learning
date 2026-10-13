package Revision;

import java.util.Scanner;

public class TrackingCodeParser {

//    [CHAPTER 11-14]
//    A logistics and package-sorting hub receives global tracking numbers.
//    Each code follows a rigid standard format, and the system needs to use nested conditions
//    and advanced string extraction (substring, indexOf) to decode the package origin, batch code, and serial number.

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Ask user to input code number

        System.out.println("Input Serial Code: ");
        String code = scanner.next().toUpperCase();
        String formatCode = code.replace("-" , "");

        // Format: US-B24-9982X

        // Check if the string length is exactly 11 characters. If not, output an error.

        if(formatCode.length() == 10){

            String country = code.substring(0,2);

            if(country.equals("US")){
                System.out.println(code);
                System.out.println("North America Hub");
            }
            else if(country.equals("MY")){
                System.out.println(code);
                System.out.println("Malaysia Hub");
            }
            else if(country.equals("UK")){
                System.out.println(code);
                System.out.println("Malaysia Hub");
            }

            String batch = code.substring(3,6);
            String serial = code.substring(7);

            System.out.println("Batch Number: " + batch);
            System.out.println("Serial Number: " + serial);

        }
        else{
            System.out.println("INVALID CODE!");
        }

        // Use indexOf("-") and substring() to slice and parse out the Country Code, Batch Code, and Serial Code.

        // State what country Hub based on country code
        scanner.close();
    }
}
