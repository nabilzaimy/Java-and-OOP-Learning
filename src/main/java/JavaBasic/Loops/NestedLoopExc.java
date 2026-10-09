package JavaBasic.Loops;

public class NestedLoopExc {


    public static void main(String[] args){

        char[] seatRow = {'A' , 'B' , 'C' , 'D' , 'E'};
        int totalSeatPerRow = 10;

        for(int i = 0 ; i < seatRow.length ; i++){
            System.out.print("Row " + seatRow[i] + ":");

            for(int seat = 1; seat <= totalSeatPerRow ; seat++){
                System.out.print("[" + seatRow[i] + seat + "]");
            }
            System.out.println();
        }
    }
}
