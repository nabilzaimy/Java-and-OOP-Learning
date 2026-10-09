package Encapsulation;

public class Main {

    public static void main(String[] args){

    Car car = new Car("Mustang" , "Blue" , 20000);

        car.setModel("Corvette");
        System.out.println(car.getModel() + car.getColor() + car.getPrice());

    }
}
