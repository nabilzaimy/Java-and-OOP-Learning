package OOP.Inheritance;

public class PaymentMethod {

    // Parent Class

    double amount;

    void processPayment(){

        System.out.println("Processing payment of $" + amount);
    }


    void speak(){
        System.out.println("AR8");
    }
}
