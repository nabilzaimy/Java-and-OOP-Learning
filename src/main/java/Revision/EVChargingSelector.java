package Revision;

import java.util.Scanner;

public class EVChargingSelector {
    public static void main(String[] args){

        // CHAPTER 3(SCANNER) ,16(TERNARY OPERATORS) ,18(ENHANCED SWTICH)

        // An electric vehicle (EV) fast-charging station needs a quick decision utility
        // to determine the vehicle's charging tier pricing category
        // based on its current battery level percentage, utilizing ternary logic and enhanced switches.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Current Battery Percentage% (0-100): ");
        double battery = scanner.nextDouble();

        System.out.print("Enter Charging Speed [F-Fast] [S-STANDARD]: ");
        char speed = scanner.next().charAt(0);

        String batteryTier = (battery <= 20) ? "CRITICAL" : "NORMAL";
        System.out.println(batteryTier);

        switch(speed){
            case 'F' -> System.out.println("FAST CHARGING");
            case 'S' -> System.out.println("STANDARD CHARGING");
            default -> System.out.println("Invalid tier selected. Defaulting to standard rate.");
        }


        scanner.close();
    }
}
