package Revision.BankAccountValidator;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private Double balance;

    BankAccount(String accountNumber , String accountHolder , Double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        setBalance(balance);
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    String getAccountNumber(){
        return "****" + accountNumber.substring(8,12);
    }

    public Double getBalance(){
        return balance;
    }

    public void setBalance(Double balance){
        if(balance < 0){
            System.out.println("ERROR !");
        }
        else{
            this.balance = balance;
        }
    }

}
