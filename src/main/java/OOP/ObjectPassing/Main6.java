package OOP.ObjectPassing;

public class Main6 {

    public static void main(String[] args) {

        Barista barista = new Barista();

        Coffee coffee1 = new Coffee("Latte");
        Coffee coffee2 = new Coffee("Espresso");

        coffee1.setSugar(true);

        barista.makeCoffee(coffee1);
        barista.addOn(coffee1);

        coffee2.setSugar(false);

        barista.makeCoffee(coffee2);
        barista.addOn(coffee2);
    }
}
