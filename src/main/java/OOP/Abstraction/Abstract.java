package OOP.Abstraction;

public class Abstract {

    public static void main(String[] args){

        // abstract = abstract classes can't be instantiated -> Car car = new Car(); ❌ Wrong
        //            abstract classes can have implementation
        //            abstract method are declared without an implementation.

        SavingsAccount savingsAccount = new SavingsAccount("SAV-001" , 50.0);
        CurrentAccount currentAccount = new CurrentAccount("SAV-002" , 32.0);

        savingsAccount.calculateInterest();
        currentAccount.calculateInterest();

        savingsAccount.displayBalance();
        currentAccount.displayBalance();

    }
}
