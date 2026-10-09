package OOP.Inheritance;

public class EWalletPayment extends PaymentMethod {

    // Sub/Child Class

    String email = "nabil@gmail.com";
    double balance;

    void checkBalance(){

        System.out.println("Checking account balance for " + email +" " + balance);
    }

@Override
    void speak(){
        System.out.println("Arkkk");
    }
}
