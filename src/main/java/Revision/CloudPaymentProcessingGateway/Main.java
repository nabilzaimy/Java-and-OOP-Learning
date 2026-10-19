package Revision.CloudPaymentProcessingGateway;

public class Main {
    public static void main(String[] args){

        // CHAPTERS COVERED: CHAPTER 48 (ABSTRACTION), CHAPTER 49 (INTERFACES),
        // CHAPTER 44/45 (INHERITANCE & SUPER), AND CHAPTER 47 (TO-STRING).

        // A multivendor e-commerce platform processes different payment methods (Credit Cards and Cryptocurrencies).
        // The system mandates security compliance through an Interface and defines a shared blueprint using
        // an Abstract Class, ensuring every payment processor handles transactions securely.

        CreditCardProcessor creditCardProcessor = new CreditCardProcessor("1234-5678-9101" , "MY-001" , 2000);
        System.out.println(creditCardProcessor);

        String tokenInput = "SECURE_AUTH_99";

        if(creditCardProcessor.authenticateToken(tokenInput)){
            System.out.println("Authentication Successful");
            creditCardProcessor.processPayment();
        }
        else {
            System.out.println("Authentication Unsuccessful");
        }
    }
}
