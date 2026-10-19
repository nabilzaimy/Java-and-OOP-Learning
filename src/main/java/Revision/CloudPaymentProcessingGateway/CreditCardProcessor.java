package Revision.CloudPaymentProcessingGateway;

public class CreditCardProcessor extends PaymentProcessor{

    String cardNumber;

    CreditCardProcessor(String cardNumber , String transactionId, double amount) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean authenticateToken(String token){
        return token != null && token.equals("SECURE_AUTH_99");    }

    @Override
    public void processPayment(){
        System.out.printf("Processing Credit Card Payment of %.2f for card ending with %s...%n",
                amount, cardNumber.substring(cardNumber.length()-4));
    }

    @Override
    public String toString(){
        return "CreditCardTransaction [ID: " + transactionId + " Amount: " + amount + "]";
    }

}
