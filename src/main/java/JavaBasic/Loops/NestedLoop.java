package JavaBasic.Loops;

import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbols;

        System.out.print("Insert # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Insert # of columns: ");
        columns = scanner.nextInt();

        System.out.print("Insert # of symbols: ");
        symbols = scanner.next().charAt(0);


        for(int i = 0 ; i < rows ; i++){
            for(int j = 0; j < columns ; j++){
                System.out.print(symbols + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
