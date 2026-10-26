package Revision.TreasuryEngineTest;

import java.util.ArrayList;

public class CorporateTreasury {

    private final ArrayList<Object> subsidiaryInfo;
    private String corporateName;
    // Chapter 56: ArrayList
    private ArrayList<SubsidiaryAccount> subsidiaries;

    public CorporateTreasury(String corporateName) {
        this.corporateName = corporateName;
        this.subsidiaryInfo = new ArrayList<>(); // Note: matches field assignment below
        this.subsidiaries = new ArrayList<>();
    }

    public void addSubsidiary(SubsidiaryAccount acc) {
        subsidiaries.add(acc);
    }

    // Computes aggregate total across the ArrayList
    public double calculateTotalLiquidity() {
        double total = 0;
        for (SubsidiaryAccount acc : subsidiaries) {
            total += acc.getBalance();
        }
        return total;
    }

    // Filtering algorithm returning a subset ArrayList
    public ArrayList<SubsidiaryAccount> getAccountsAboveThreshold(double minLimit) {
        ArrayList<SubsidiaryAccount> filteredList = new ArrayList<>();
        for (SubsidiaryAccount acc : subsidiaries) {
            if (acc.getBalance() >= minLimit) {
                filteredList.add(acc);
            }
        }
        return filteredList;
    }
}