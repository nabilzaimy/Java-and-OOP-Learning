package JavaBasic.MiniProjects;

import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1,101);

        System.out.println("Guess Number between 1-100");


        do{

            System.out.println("Enter Your Guess Number: ");
            guess = scanner.nextInt();

            if(guess < randomNumber){
                System.out.println("It is Low !");
            }
            else if(guess > randomNumber){
                System.out.println("It is High !");
            }

            attempts++;
        }
        while(guess != randomNumber);

        System.out.println("You are correct !");
        System.out.println(attempts + " Numbers of attempts.");

    }
}
