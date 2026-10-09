package JavaBasic.MiniProjects;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    public static void main(String[] args) {

        // JAVA SLOT MACHINE

        //DECLARE VARIABLES

        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        //DISPLAY WELCOME MESSAGE
        System.out.println("********************");
        System.out.println("  WELCOME TO SLOTS  ");
        System.out.println("Symbols: 🍏 🍎 🍐 🍊🍋 ");
        System.out.println("********************");

        //PLAY IF BALANCE > 0

        while (balance > 0) {

            //ENTER AMOUNT

            System.out.println("Current Balance: RM" + balance);
            System.out.println("Place Your Bet Amount: RM");
            bet = scanner.nextInt();

            scanner.nextLine();
            //      VERIFY IF THE BET > BALANCE

            if (bet > balance) {
                System.out.println("Not Enough Balance!");
                continue;
            } else if (bet <= 0) {

                //      VERIFY IF THE BET > 0
                System.out.println("Cannot Bet less than RM 0 ");

            } else {
                //      SUBTRACT BET FROM BALANCE

                balance -= bet;
                System.out.println("RM" + balance);
            }

            //SPIN ROW - EMOJIS
            System.out.println("Spinning.....");
            row = spinRow();
            printRow(row);
            payout = getPayOut(row, bet);

            if (payout > 0 ){
                System.out.println("You won RM: " + payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry ypu lost !");
            }

            System.out.println("Do you want to play again?");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")){
                break;
            }

        }

        scanner.close();
    }

    static String[] spinRow() {

        String[] symbols = {"🍏", "🍎", "🍐", "🍊", "🍋"};
        String[] row = new String[3];  // can hold 3 Arrays

        Random random = new Random();

        for (int i = 0; i < 3; i++) {

            row[i] = symbols[random.nextInt(symbols.length)];

        }
        return row;
    }

    static void printRow(String[] row) {
        System.out.println("********************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("********************");

    }

    static int getPayOut(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {

                return switch (row[0]){

                    case "🍏" -> bet *3;
                    case "🍎" -> bet *4;
                    case "🍐" -> bet *5;
                    case "🍊" -> bet *10;
                    case "🍋" -> bet *20;
                    default -> 0;
                };
        }

        return 0;
    }
}