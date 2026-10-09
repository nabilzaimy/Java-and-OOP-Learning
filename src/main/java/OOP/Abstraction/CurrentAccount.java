package OOP.Abstraction;

public class CurrentAccount extends BankAccount{

    public CurrentAccount(String accountNumber , double balance){
        super(accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("Current Account does not earn interest.");
    }
}
