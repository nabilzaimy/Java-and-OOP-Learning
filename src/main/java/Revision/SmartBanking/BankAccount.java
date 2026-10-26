package Revision.SmartBanking;

import java.util.ArrayList;

public class BankAccount {

    String name;
    ArrayList<Double> transactions = new ArrayList<>();

    BankAccount(String name){
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Invalid Amount");
        }
        transactions.add(amount);
        System.out.println("Successfully Deposited: RM" + amount);
    }

    public double balance(){
        double total = 0.0;

        for(Double trasaction : transactions){
            total = total + trasaction;
        }
        return total;
    }
}
