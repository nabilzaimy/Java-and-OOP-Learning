package Threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Chapter 69: Threading = Allows a program to run simultaneously.

        Scanner scanner = new Scanner(System.in);

        System.out.println("YOU HAVE 5 SECONDS TO ENTER YOUR NAME !");

        // This Run in Background !
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.println(name);

        scanner.close();
    }
}
