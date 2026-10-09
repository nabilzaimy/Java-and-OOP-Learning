package OOP.Encapsulation;

public class Main13 {

    public static void main(String[] args){

        BankAccounts myAccount = new BankAccounts("ACC-001" , 200.20);

        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: " + myAccount.getBalance());

        myAccount.setDeposit(200);
        System.out.println("Updated Balance: RM" + myAccount.getBalance());

        myAccount.setDeposit(-50.0);
    }
}
