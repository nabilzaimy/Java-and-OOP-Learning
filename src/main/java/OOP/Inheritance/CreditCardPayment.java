package OOP.Inheritance;

public class CreditCardPayment extends PaymentMethod {

    // Sub/Child Class

    String cardNumber;
    int cvv;

    void verifyCard(){
        String last4Digits = cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Verifying credit card ending in " + last4Digits);
    }
}
