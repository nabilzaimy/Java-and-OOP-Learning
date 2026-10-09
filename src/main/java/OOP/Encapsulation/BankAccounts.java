package OOP.Encapsulation;

public class BankAccounts {

    private String accountNumber;
    private double balance;

    BankAccounts(String accountNumber , double balance){
        this.accountNumber = accountNumber;
         if(balance>=0){
             this.balance = balance;
         }
         else{
             this.balance = 0;
         }
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setDeposit(double amount){

        if(amount >= 0){
            this.balance += amount;
        }
        else{
            System.out.println("Invalid Deposit Amount");
        }
    }



}
