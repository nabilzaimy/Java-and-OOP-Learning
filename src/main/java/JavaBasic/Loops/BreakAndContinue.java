package JavaBasic.Loops;

public class BreakAndContinue {

    //Break = break out of the loop (STOP)
    //Continue = skip current iteration of a loop (SKIP)

    public static void main(String[] args){

        for(int i = 1 ; i <= 10 ; i++){

            if(i ==5){
                break;
            }

            System.out.println(i);
        }

        for(int i = 1 ; i <= 10 ; i++){

            if(i ==5){
                continue;
            }

            System.out.println(i);
        }
    }
}
