package Revision.TreasuryEngineTest;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CorporateTreasury treasury = new CorporateTreasury("Global Holdings Bhd");

        treasury.addSubsidiary(new SubsidiaryAccount("SUB-KL-01", 450000.00));
        treasury.addSubsidiary(new SubsidiaryAccount("SUB-PEN-02", 85000.50));
        treasury.addSubsidiary(new SubsidiaryAccount("SUB-JB-03", 1200000.00));
        treasury.addSubsidiary(new SubsidiaryAccount("SUB-SG-04", 15000.00));

        System.out.printf("Total Enterprise Liquidity: $%.2f%n", treasury.calculateTotalLiquidity());

        System.out.println("\nSubsidiaries with Liquidity >= $100,000:");
        ArrayList<SubsidiaryAccount> richSubsidiaries = treasury.getAccountsAboveThreshold(100000.00);
        for (SubsidiaryAccount sub : richSubsidiaries) {
            System.out.println(sub);
        }
    }
}
