package JavaBasic.Loops;

public class NestedLoopExc2 {

    public static void main(String[] args) {

        String day[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for(int i = 0 ; i < day.length ; i++) {

            System.out.print(day[i]);
            System.out.print("   ");
        }

        System.out.println(" ");
        for(int date = 1 ; date <=31 ; date++){

            System.out.print(date + "   ");
            if(date == 7){
                System.out.println();
            }
            if(date == 14){
                System.out.println();
            }
            if(date == 21){
                System.out.println();
            }
            if(date == 28){
                System.out.println();
            }

        }

    }
}

