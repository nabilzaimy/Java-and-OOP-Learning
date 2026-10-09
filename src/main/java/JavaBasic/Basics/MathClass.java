package JavaBasic.Basics;

import java.util.Scanner;

public class MathClass {

    public static void main(String[] args){

       // HYPOTHENEUS - c = Math.sqrt( a^2 + b^2)
       // CIRCUMFERENCE = 2 * PI * radius
       // AREA = PI * radius^2
       // VOLUME = 4/3 * PI * radius^3

        Scanner scanner = new Scanner(System.in);

//        double a;
//        double b;
//        double c;
//
//        System.out.print("Input A value: ");
//        a = scanner.nextDouble();
//
//        System.out.print("Input B value: ");
//        b = scanner.nextDouble();
//
//        System.out.print("Results: " + Math.sqrt(Math.pow(a,2) + Math.pow(b,2)) + "cm3");

        double r;

        System.out.print("Enter Value of Radius: ");
        r = scanner.nextDouble();

        System.out.printf("Circumference Value: %.2f\n", 2*Math.PI*r);
        System.out.printf("Area Value: %.2f\n", Math.PI * Math.pow(r,2));
        System.out.printf("Volume Value: %.2f", 4/3 * Math.PI * Math.pow(r,3));



        scanner.close();
    }
}
