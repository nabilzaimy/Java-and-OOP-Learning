package DynamicPolymorphism;

import package1.A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal animal;

        System.out.println("Choose Your Animal: (1-Cat) (2-Dog)");
        choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Cat();
            animal.speak();
        }
        else if(choice ==2){
            animal = new Dog();
            animal.speak();
        }
    }
}