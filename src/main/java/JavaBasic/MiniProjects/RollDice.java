package JavaBasic.MiniProjects;

import java.util.Random;
import java.util.Scanner;

public class RollDice {

    int rollDice;
    public static void main(String[] args){

        //Input how many dice rolls?
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int roll;
        int totalRoll = 0;

        System.out.print("Enter Number of Dice Roll: ");
        roll = scanner.nextInt();

        for(int i = 0 ; i < roll ; i++){
            int rollDice = random.nextInt(1,7);
            die(rollDice);
            System.out.println(rollDice);
            totalRoll+=roll;
        }

        //print number of dice rolls chosen

        System.out.println("Total Roll: " + totalRoll);
        //print the dice rolls
        //print total of the dice roll
    }

     static void die(int rollDice){

        String dice1 =  """
                    ______
                   |      |      
                   |   x  |  
                   |      |  
                   |______|
                """;

        String dice2 = """
                    ______
                   |      |      
                   | x  x |  
                   |      |  
                   |______|
                """;

        String dice3 =  """
                    ______
                   |  x   |      
                   |  x   |  
                   |  x   |  
                   |______|
                """;

        String dice4 = """
                    ______
                   |x    x|      
                   |      |  
                   |x    x|  
                   |______|
                """;

        String dice5 =  """
                    ______
                   |x    x|      
                   |   x  |  
                   |x    x|  
                   |______|
                """;

        String dice6 = """
                    ______
                   |x    x|      
                   |x    x|  
                   |x    x|  
                   |______|
                """;

        switch(rollDice){

            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Roll");
        }

        }
}