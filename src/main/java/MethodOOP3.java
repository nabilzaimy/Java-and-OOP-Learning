public class MethodOOP3 {

    public static void main(String[] agrs){

        // Learning 2: Overloaded Methods

        double x;
        x = add(1.2,2.3,3.4); // make sure nombor ini dalam double or int
    }

    static int add(int a , int b){
        int result = a + b;
        System.out.println("This is method 1 #" + result);
        return result;
    }

    static int add(int a, int b , int c){
        int result = a + b + c;
        System.out.println("This is method 2 #" + result);
        return result;
    }

    static double add(double a , double b) {
        double result = a + b;
        System.out.println("This is method 3 #" + result);
        return result;
    }

    static double add(double a, double b , double c){
        double result = a + b + c;
        System.out.println("This is method 4 #" + result);
        return result;
    }
}
