package JavaBasic.Arrays;

public class DoubleDimensionArray {

    public static void main(String[] args){

//        String[] fruits = {"Apple" , "Banana" , "Orange"};
//        String[] vegetables = {"Carrot" , "Celery" , "Bayleaf"};
//        String[] meats = {"Chicken" , "Cow" , "Duck"};

        String[][] groceries = {{"Apple" , "Banana" , "Orange"},
                                 {"Carrot" , "Celery" , "Bayleaf"},
                                 {"Chicken" , "Cow" , "Duck"}};

        // replace:

        groceries[1][1] = "KitKat";

        for(String[] food : groceries){

            for(String foods : food){
                System.out.print(foods + " ");
            }
            System.out.println();
        }

    }
}
