package JavaBasic.Arrays;

import java.util.Scanner;

public class SerachAnArray {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {13,21,45,5,32,3};
        String[] fruits = {"apple" , "banana" , "orange" , "coconut"};
        String target;
        boolean isFound = false;

        System.out.print("Enter fruit: ");
        target = scanner.nextLine();

        for(int i = 0 ; i < fruits.length ; i++){

            if(fruits[i].equals(target)){
                System.out.println(i);
                isFound = true;
                break;
            }

            }
        if(!isFound){
            System.out.println("Invalid Number !");
        }

        scanner.close();
    }
}
