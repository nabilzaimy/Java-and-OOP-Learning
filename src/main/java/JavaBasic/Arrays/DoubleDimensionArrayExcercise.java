package JavaBasic.Arrays;

public class DoubleDimensionArrayExcercise {

    public static void main(String[] args){

        int[][] numbers = { {3 , 5 , 1} ,
                            {2 , 8 , 4} ,
                            {9 , 7 , 6}
        };

        int sum = 0;

        for(int[] number : numbers){
            for(int row : number){

                System.out.print(row + " ");
                sum += row;
            }

            System.out.println();
        }
        System.out.println(sum);
    }
}
