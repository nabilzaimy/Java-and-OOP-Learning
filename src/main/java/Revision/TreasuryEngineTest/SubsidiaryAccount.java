package Revision.TreasuryEngineTest;

public class SubsidiaryAccount {

    private String subsidiaryId;
    private double balance;

    public SubsidiaryAccount(String subsidiaryId, double balance) {
        this.subsidiaryId = subsidiaryId;
        this.balance = balance;
    }

    public String getSubsidiaryId() {
        return subsidiaryId;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("[ID: %s | Balance: $%.2f]", subsidiaryId, balance);
    }
}
