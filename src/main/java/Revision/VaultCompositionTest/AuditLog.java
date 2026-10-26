package Revision.VaultCompositionTest;

public class AuditLog {

    Double transaction;
    String transactionType;

    AuditLog(Double transaction , String transactionType){
        this.transaction = transaction;
        this.transactionType = transactionType;
    }

    public String toString(){
        return "Amount Transaction: RM" + transaction + "\nTransaction Type: " + transactionType;
    }
}
