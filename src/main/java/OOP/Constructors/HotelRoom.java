package OOP.Constructors;

public class HotelRoom {

    int roomNumber;
    String guestName;
    double pricePerNight;
    boolean isBooked = true;
    double night;

    HotelRoom(int roomNumber , String guestName , double pricePerNight){

        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.pricePerNight = pricePerNight;
        this.isBooked = true;

    }

    void checkOut(){
        this.isBooked = false;
        this.guestName = "Vacant";
        System.out.println(roomNumber + " has been checked out.");
        System.out.println("Room" + roomNumber + " occupied by " + guestName + " " + pricePerNight + "/night");
    }

    void displaySummary(){
        if(this.isBooked){
            System.out.println("Room" + this.roomNumber + " occupied by " + this.guestName + " " + this.pricePerNight + "/night");
        }
        else{
            System.out.println("Room" + this.roomNumber + " available for booking.");
        }
    }
}
