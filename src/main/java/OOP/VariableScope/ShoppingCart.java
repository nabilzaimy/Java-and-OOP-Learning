package OOP.VariableScope;

public class ShoppingCart {

    double totalAmount = 0.0;
    //ini dah tak perlu



    public void addItem(double itemPrice) {
        // Calculate a 10% promotional discount for this item only
        double discount = itemPrice * 0.10; //bila ada double kat depan, maksudnya dah create local variable
        double finalPrice = itemPrice - discount;

        totalAmount = totalAmount + finalPrice; // Line 1
    }

    public void checkout() {
        System.out.println("Total Balance Due: $" + totalAmount);     // Line 3
    }
}

