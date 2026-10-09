package OOP.ClassesAndObjects;

public class CoffeCup {

    String flavor = "Vanilla Latte";
    double temperature = 65.5;
    boolean isEmpty = false;

    void drink(){
        System.out.println("You take a sip of the " + flavor + ".");
    }

    void spill(){
        System.out.println("Ooops! You spilled the warm coffee!");
    }
}
