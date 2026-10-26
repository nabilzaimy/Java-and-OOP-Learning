package Revision.SmartBanking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount("Muhammad Nabil");
        System.out.println();


        System.out.println("*** FX BANK ***");

        try{
            System.out.print("ENTER DEPOSIT AMOUNT: RM");
            double useramount = scanner.nextDouble();
            bankAccount.deposit(useramount);
        }

        catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        catch (Exception e){
            System.out.println("Invalid Input Format!");
        }
        finally {
            scanner.close();
        }

        System.out.println("Bank Account Holder: " + bankAccount.name);
        System.out.println("Bank Account Balance: " + bankAccount.balance());
    }
}
