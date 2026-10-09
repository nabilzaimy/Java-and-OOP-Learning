package Composition;

public class Main {

    public static void main(String[] args){

        // Composition = Design technique used to establish a strong "has-a" relationship between classes.
        //               occurs when one class contains a reference to an object of another class as a member variable.
        //               contained (child) object cannot exist independently of the container (parent) object;
        //               if the parent object is destroyed, the child object is destroyed as well

        Car car = new Car("Mustang" , "Yellow" , "V8");

        System.out.println(car.color);
        System.out.println(car.model);
        System.out.println(car.engine);
    }
}
