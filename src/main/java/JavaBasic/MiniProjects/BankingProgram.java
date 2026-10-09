package JavaBasic.MiniProjects;

import java.util.Scanner;

public class BankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        double balance = 0;
        double deposited;
        double amount;
        int choice = 0;
        boolean isRunning = true;

        while (isRunning) {

            System.out.println("**********************");
            System.out.println("Welcome To Nabil Bank!");
            System.out.println("**********************");

            System.out.println();
            System.out.println("**********************");
            System.out.println("Enter Your Choice:");
            System.out.println("1 - Check Current Balance");
            System.out.println("2 - Deposit Money");
            System.out.println("3 - Withdraw Money");
            System.out.println("4 - EXIT");
            System.out.println("**********************");

            System.out.print("Option: ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += depositMoney();
                case 3 -> balance -= withdrawnMoney(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }

    }

    static void showBalance(double balance)
    {
        System.out.println("*******************************");
        System.out.println("Current Balance: RM " + balance);
    }

    static double depositMoney(){
        double amount;

        System.out.println("Enter Amount to be DEPOSITED: RM ");
        amount = scanner.nextDouble();

        if(amount<0){
            System.out.println("Amount cant be negative!");
            return 0;
        }
        else{
            return amount;
        }

    }

    static double withdrawnMoney(double balance){

        double amount;
        System.out.println("Enter Amount to be WITHDRAWN: RM ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("NOT ENOUGH BALANCE!");
            return 0;
        }
        else if (amount < 0){
            System.out.println("Withdrawn amount cant be negative!");
            return 0;
        }

        return amount;
    }
}
