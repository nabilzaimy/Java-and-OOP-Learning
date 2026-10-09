package Abstraction;

public class Rectangle extends Shape{

    double height;
    double length;

    Rectangle(double height , double length){
        this.height = height;
        this.length = length;
    }

    @Override
    public double area(){
        return height * length;
    }
}
