package Composition;
public class Car {

    String model;
    String color;
    Engine engine;

    Car(String model , String color , String engine){
        this.model = model;
        this.color = color;
        this.engine = new Engine(engine);
    }

}
