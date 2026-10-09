package OOP.Static;

public class Friend {

    String name;

    // Static variable shared by all Friend instances
    static int numberOfFriends;

    Friend(String name) {
        this.name = name;
        numberOfFriends++; // Increments the shared counter
    }

    // Static method owned by the class
    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends");
    }
}