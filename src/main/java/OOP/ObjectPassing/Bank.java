package OOP.ObjectPassing;

public class Bank {

    void transfer(Account sender , Account recipient , double amount){

    sender.withdraw(amount);
    recipient.deposit(amount);

        System.out.println("Transferred RM" + amount + " from " + sender.ownerName + " to " + recipient.ownerName);
        System.out.println(sender.ownerName + " balance: RM " + sender.balance);
        System.out.println(recipient.ownerName + " balance: RM " + recipient.balance);
    }
}
