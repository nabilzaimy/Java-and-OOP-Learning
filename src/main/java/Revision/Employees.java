package Revision;

import java.util.Random;
import java.util.Scanner;

public class Employees {

    public static void main(String[] args){

//        [CHAPTER 1 -4]

//        Excercise = A corporate office wants a lightweight terminal tool
//                    for the HR department to quickly generate
//                    employee security badges, extract usernames, and format details.

        String name;
        String department;
        int id;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Insert Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Department: ");
        department = scanner.nextLine();

        id = random.nextInt(1000, 9999);

        System.out.println(" ");
        System.out.println("\n--- SECURITY BADGE ---");
        System.out.printf("Name %s", name);
        System.out.println(department);
        System.out.println(id);



        scanner.close();
    }
}
