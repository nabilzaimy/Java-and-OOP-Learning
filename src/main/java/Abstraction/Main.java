package Abstraction;

public class Main {
    public static void main(String[] args){

        // abstract = Used to define abstract classes and methods
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential details
        //            Abstract classes can't be instantiated directly;
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'abstract' methods (which are inherited)


        Circle circle = new Circle(3.5);
        Rectangle rectangle = new Rectangle(7,6);
        Triangle triangle = new Triangle(5,4);

        circle.shapes();
        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
    }
}
