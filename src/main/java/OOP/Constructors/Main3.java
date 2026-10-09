package OOP.Constructors;

public class Main3 {

    public static void main(String[] args){

    HotelRoom room101 = new HotelRoom(101 , "Alice" , 150.0);
    HotelRoom room102 = new HotelRoom(102 , "Bob" , 200.0);

    room101.displaySummary();
    room102.displaySummary();
    System.out.println("");
    room101.checkOut();
    room101.displaySummary();

    }
}
