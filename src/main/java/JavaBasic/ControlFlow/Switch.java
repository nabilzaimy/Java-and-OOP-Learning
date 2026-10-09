package JavaBasic.ControlFlow;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args){

        // Enhance switches - work like an if else statement

        Scanner scanner = new Scanner(System.in);

        MySelf self = new MySelf();

        int age;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        switch(Integer.valueOf(age)){

            case Integer i when i > 18  -> System.out.println("You are an adult!");
            case Integer i when i < 18  -> System.out.println(("You are a kid!"));
            default -> System.out.printf("Enter your age correctly !");
        }

        scanner.close();

        System.out.println(self.name);

        self.sleep();
        self.run();

    }
}
