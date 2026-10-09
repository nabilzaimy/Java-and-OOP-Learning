package OOP.Inheritance;

public class Main9 {

    public static void main(String[] args){

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.amount = 500.0;
        creditCardPayment.cardNumber = "1234 5678 9123";
        creditCardPayment.cvv = 123;
        creditCardPayment.processPayment();
        creditCardPayment.verifyCard();

        System.out.println("********************************");

        EWalletPayment eWalletPayment = new EWalletPayment();
        eWalletPayment.amount = 45.40;
        eWalletPayment.email = "nabil@gmail.com";
        eWalletPayment.balance = 200.0;
        eWalletPayment.processPayment();
        eWalletPayment.checkBalance();

        eWalletPayment.speak();

    }
}
