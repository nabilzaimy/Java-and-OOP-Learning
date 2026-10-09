package OOP.Abstraction;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountNumber , double balance){
        super(accountNumber , balance);
    }

    @Override
    void calculateInterest(){

        double interest = this.balance * 0.03;
        this.balance += interest;
        System.out.println("Savings Account Interest Earned: RM" + interest);
    }
}
