package OOP.Abstraction;

public abstract class BankAccount {

    String accountNumber;
    double balance;

    BankAccount(String accountNumber , double balance){

        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void calculateInterest();

    void displayBalance(){
        System.out.println(this.accountNumber);
        System.out.println(this.balance);
    }
}


