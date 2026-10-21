package Revision.BankAccountValidator;

public class Main {
    public static void main(String[] args){

        // Chapters Covered: Chapters 39-40 (OOP/Constructors), 52 (Getters & Setters), and 55 (Wrapper Classes).

        // A retail bank wants a secure account utility. The account class must encapsulate sensitive data
        // using private fields, expose them via getters and setters with strict validation logic
        // (preventing negative balances or unauthorized account numbers),
        // and use wrapper classes for handling transaction limits.

        System.out.println("--- Testing Secure Bank Account ---");
        BankAccount acc = new BankAccount("123456789012", "Muhammad Nabil", 1500.50);
        acc.setBalance(-10.0);

        System.out.println("Account Holder : " + acc.getAccountHolder());
        System.out.println("Masked Account : " + acc.getAccountNumber());
        System.out.println("Current Balance: $" + acc.getBalance());

    }
}
