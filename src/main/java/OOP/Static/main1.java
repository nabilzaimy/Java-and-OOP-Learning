package OOP.Static;

public class main1 {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");

        // Access static method using the Class name directly
        Friend.displayFriends(); // Output: You have 3 friends
    }
}
