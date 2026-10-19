package Revision.CloudPaymentProcessingGateway;

public interface Securable {

    boolean authenticateToken(String token);
}
