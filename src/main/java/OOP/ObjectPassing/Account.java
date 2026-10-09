package OOP.ObjectPassing;

public class Account {

    String ownerName;
    double balance;

    Account(String ownerName , double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

}
