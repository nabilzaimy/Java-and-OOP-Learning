package OOP.ObjectPassing;

public class Main7 {

    public static void main(String[] args){

        Account account1 = new Account("Alice" , 500.0);
        Account account2 = new Account("Bob" , 200.0);

        Bank bank = new Bank();

        bank.transfer(account1 , account2 , 150.0);
    }
}
