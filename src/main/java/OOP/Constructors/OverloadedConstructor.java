package OOP.Constructors;

public class OverloadedConstructor {

//    overloaded constructor = multiple constructors within a class with the same name,
//                            but have different parameters
//                            name + parameters = signature

    public static void main(String[] args){

        Pizza pizza = new Pizza("Garlic Bread" , "Cheese Crust" , "Pepperoni");

        System.out.println("The Ingredient for Your Pizza are: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.crust);
        System.out.println(pizza.toppings);

        System.out.println(" ");

        Pizza pizza1 = new Pizza("Garlic Bread" , "Cheese Crust");

        System.out.println("The Ingredient for Your Pizza are: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.crust);

        System.out.println(" ");


        Pizza pizza2 = new Pizza("Garlic Bread");

        System.out.println("The Ingredient for Your Pizza are: ");
        System.out.println(pizza2.bread);

    }

}
