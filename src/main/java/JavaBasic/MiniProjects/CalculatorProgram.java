package JavaBasic.MiniProjects;

import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean invalidOperator = true;

        System.out.println("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter operator ( + , - , * , / , ^ ): ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter second number: ");
        num2 = scanner.nextDouble();

        switch (operator){

            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' ->
            {
                if(num2 == 0){
                    System.out.println("Invalid Number !");
                    invalidOperator = false;
                }
                else
                {
                    result = num1 / num2;
                }

            }
            case '^' -> result = Math.pow(num1 , num2);
            default -> {
                System.out.print("Invalid Operator !");
                invalidOperator = false;
            }


        }

        if (invalidOperator)
        {
            System.out.println(result);
        }

        scanner.close();
    }
}
