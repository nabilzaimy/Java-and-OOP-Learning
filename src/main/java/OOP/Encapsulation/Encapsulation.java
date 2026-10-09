package OOP.Encapsulation;

import package2.C;

public class Encapsulation {

    public static void main(String[] args){

        Car2 car = new Car2("Toyota" , "Vios" , 2002);

        car.setYear(2003);
        System.out.println(car.getBrand());
        System.out.println(car.getYear());
    }
}
