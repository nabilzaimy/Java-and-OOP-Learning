package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> food = new ArrayList<>();

        System.out.print("Enter Number of Food: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1 ; i <= numOfFood ; i++){
            System.out.print("Enter name of foods #" + i + ": ");
            String foods =scanner.next();
            food.add(foods);
        }

        System.out.println(food);
        scanner.close();
    }
}
