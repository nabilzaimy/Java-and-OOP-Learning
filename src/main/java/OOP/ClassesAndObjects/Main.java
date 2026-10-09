package OOP.ClassesAndObjects;
public class Main {

    public static void main(String[] args){

    CoffeCup order1 = new CoffeCup();
    CoffeCup order2 = new CoffeCup();

    order1.drink();
    order2.spill();

    System.out.println(order1.flavor);
    System.out.println(order1.temperature);



    }
}
