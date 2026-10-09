package JavaBasic.Basics;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Random random = new Random();

        int number;
        boolean gender;
        char grade;

        number = random.nextInt(1, 1001);
        gender = random.nextBoolean();

        System.out.println("Your Number is: " + number);

        if (gender) {
            System.out.println("Your Gender is Male");
        }
        else
        {
            System.out.println("Your Number is Female");
        }
    }
}

