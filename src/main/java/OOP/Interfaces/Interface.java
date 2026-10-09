package OOP.Interfaces;

public class Interface {

    public static void main(String[] args){

        //  Interface = a template that can be applied to class
        //              similar to inheritance, but specifies what a class/has must do
        //              classes can apply more than one interfaces, inheritance only 1 super

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
