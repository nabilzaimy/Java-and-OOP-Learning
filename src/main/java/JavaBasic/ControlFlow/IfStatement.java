package JavaBasic.ControlFlow;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("What is Your Name: ");
        name = scanner.nextLine();

        System.out.print("What is Your Age: ");
        age = scanner.nextInt();

        System.out.print("Are You a Student? [true/false]: ");
        isStudent = scanner.nextBoolean();


        //GROUP 1
        if (name.isEmpty()) {
            System.out.println("INPUT YOUR NAME!");

        } else {
            System.out.println("NAME: " + name);

        }

        //GROUP 2
        if (age >= 65) {
            System.out.println(age + "- You are Senior!");
        } else if (age >= 18) {
            System.out.println(age + "- You are an adult!");
        } else if (age < 18) {
            System.out.println(age + "- You are an Teen!");
        } else if (age == 0) {
            System.out.println(age + "- You are Baby!");

        } else if (age < 0) {
            System.out.println(age + "- You're Not Born Yet!");

        }

        // GROUP 3
        if (isStudent) {
            System.out.println("You are A student !");
        } else {
            System.out.println("You are NOT Student !");
        }
    }
}
