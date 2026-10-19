package Revision.CloudPaymentProcessingGateway;

public abstract class PaymentProcessor implements Securable{

    String transactionId;
    double amount;

    PaymentProcessor(String transactionId , double amount){
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public abstract void processPayment();

}
