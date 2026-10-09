package WrapperClass;

public class Main {
    public static void main(String[] args){

        //  wrapper = storing primitive datatypes -> objects

        int num = 7;
        Integer num1 = num;  // Auto-Boxing

        System.out.println(num1);

        String num2 = "12";
        int num3 = Integer.parseInt(num2); // Auto-Unboxing

        char a = '@';
        String b = String.valueOf(a);
        System.out.println(b);

        System.out.println(num3*2);
    }
}
