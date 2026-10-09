package PaymentGateway;

abstract class PaymentMethod {

        boolean authorization;
        double transactionFee;


        boolean authorize(double amount){
            return authorization;
        }

        double calculateFee(double amount){
            return transactionFee;
        }

        void executePayment(double amount){
            System.out.println("Receipt: ");
        }
}
