package Revision.VaultCompositionTest;

public class Main {
    public static void main(String[] args){

        // Chapters Covered: Chapter 54 (Composition), Chapter 55 (Wrapper Classes), and Chapter 56 (ArrayLists).

        // A high-security central bank vault manages currency reserves.
        // A CentralVault is tightly bound to its internal structural components via Composition
        // (meaning if the vault is destroyed, its security lock mechanism
        // and transaction audit logs cannot exist independently).
        // The system processes a stream of dynamic audit logs using ArrayList and wrapper classes.

        CentralVault centralVault = new CentralVault();

        centralVault.RecordTransaction(2000.0 , "DEPOSIT");
        centralVault.RecordTransaction(1050.81 , "WITHDRAWAL");
        centralVault.RecordTransaction(510.81 , "WITHDRAWAL");


        centralVault.printAuditReport();

    }
}
