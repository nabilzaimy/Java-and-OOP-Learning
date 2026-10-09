package OOP.Constructors;

public class Pizza {
    String bread;
    String crust;
    String toppings;

    Pizza(String bread){

        this.bread = bread;
    }

    Pizza(String bread , String crust){

        this.bread = bread;
        this.crust = crust;
    }

    Pizza(String bread , String crust , String toppings){

        this.bread = bread;
        this.crust = crust;
        this.toppings = toppings;
    }
}
