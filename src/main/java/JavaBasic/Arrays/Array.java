package JavaBasic.Arrays;

public class Array {

    public static void main(String[] args){

        int number[] = new int[3];

        number[0] = 10;
        number[1] = 20;
        number[2] = 30;


        for(int i = 0 ; i < number.length ; i++){
            System.out.println(number[i]);

            if(number[i] == 20){
                System.out.println("MY NUMBER IS 20");

            }
        }
    }
}
