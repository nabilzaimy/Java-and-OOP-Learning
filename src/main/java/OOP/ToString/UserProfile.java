package OOP.ToString;

public class UserProfile {

//    String make = "SUV";
//    String model = "HONDA";
//    int year = 2002;
//    double dailyRate = 50.0;
//
//    public String toString(){
//        String myString = make +"\n" + model +"\n" + year +"\n" + dailyRate;
//        return myString;
//    }

    String username = "jdoe";
    String email = "jdoe@example.com";
    String role = "Admin";
    boolean isActive = true;

    public String toString(){
        String myString = username + " | " + email + " | " + role + " | " +  isActive;
        return myString;
    }
}
