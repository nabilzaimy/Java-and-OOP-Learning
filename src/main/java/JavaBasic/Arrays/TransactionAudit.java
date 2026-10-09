package JavaBasic.Arrays;

public class TransactionAudit {

    public static void main(String[] args){

        double[] transactions = {120.0 , 45.0 , 600.0 , 12.0 , 850.25 , 30.0};

        int totalFees = 0;
        for(int i = 0 ; i < transactions.length ; i++ ){

            if(transactions[i] < 50.0){
                System.out.println("Fee Applied: $2 fee charged on Transaction" + i + "$" + transactions[i]);
                totalFees++;
            }

            if(transactions[i] >= 500.0){
                System.out.println("High-Value Flag: Transaction " + i + " of " + "$" + transactions[i] + " requires verification.");
            }
        }

        System.out.println("Total fee-bearing transactions: " + totalFees);
    }
}
