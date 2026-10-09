package JavaBasic.Methods;

public class VarArgs {

    // function: Eliminate overloaded method
    // to use: (dataType... variableName)

    public static void main(String[] args){

        System.out.println(average(1,2,3,4));

    }

    static double average(double... numbers){

        double sum = 0;


        for(double number : numbers){
            sum += number;
        }
        return sum/ numbers.length;
    }
}
