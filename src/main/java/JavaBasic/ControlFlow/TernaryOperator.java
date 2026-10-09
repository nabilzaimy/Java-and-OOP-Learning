package JavaBasic.ControlFlow;

public class TernaryOperator {

    public static void main(String[] args){

        // ternary operator ? = Return 1 or 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse

//        int hours = 2;
//
//        String timeOfDay = (hours >= 12) ? "PM" : "AM";
//
//        System.out.println("Its " + hours + timeOfDay);

        double income = 60000;

        double taxRate = (income >= 40000) ? income * 0.25 : income * 0.15;

        System.out.println("Total income after tax deduction is: RM" + taxRate);
    }
}
