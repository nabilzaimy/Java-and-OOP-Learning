package JavaBasic.Strings;

import java.util.Scanner;

public class StringMethod {

    public static void main (String[] args){

        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name: ");
        name = scanner.nextLine();
//        int length = name.length();
//        char letter = name.charAt(10);
//        int index = name.indexOf("a");
//        int lastIndex = name.lastIndexOf("a");
////        name = name.toUpperCase();
////        name = name.toLowerCase();
////        name = name.trim();
////        name = name.replace("N","Y");
//
//        System.out.println(length);
//        System.out.println(letter);
//        System.out.println(index);
//        System.out.println(lastIndex);
//        System.out.println(name);
        System.out.println(name.isEmpty());

        if(name.equalsIgnoreCase("Nabil"))
        {
            System.out.println("Your name is:" + name);
        }
        else{
            System.out.println("Your name is not nabil ! Who are you ?");
        }

        scanner.close();
    }

}
