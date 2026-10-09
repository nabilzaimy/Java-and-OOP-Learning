package OOP.ObjectPassing;

public class Barista {

    void makeCoffee(Coffee coffee){

        System.out.println("Preparing a hot " + coffee.order);
    }

    void addOn(Coffee coffee){

        if(coffee.hasSugar){
            System.out.println("Adding extra sugar to " + coffee.order);
        }
        else{
            System.out.println("Dont add anything to " + coffee.order);
        }
    }
}
