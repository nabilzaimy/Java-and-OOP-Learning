package OOP.VariableScope;

public class VariableScope {

    //local = - declared inside a method
    //        - visible only to that method
    // to access local = use just the variable name

    //global = - declared outside a method, but within a class
    //         - visible to all parts of a class
    //to access global = use this.variable

    public static void main(String[] args){

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(29.99);
        shoppingCart.checkout();
    }

}


//