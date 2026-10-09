package OOP.Constructors;

public class Main5 {

    public static void main(String[] args){

        Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1);

        Vehicle vehicle2 = new Vehicle("Make" , "SUV");
        System.out.println(vehicle2.make);
        System.out.println(vehicle2.model);
        System.out.println(vehicle2);

        System.out.println(" ");

        Vehicle vehicle3 = new Vehicle("Make" , "HatchBack" , 2020);
        System.out.println(vehicle3.make);
        System.out.println(vehicle3.model);
        System.out.println(vehicle3.year);
        System.out.println(vehicle3);

        System.out.println(" ");

        Vehicle vehicle4 = new Vehicle("Make" , "Sedan" , 2023 , 100.0);
        System.out.println(vehicle4.make);
        System.out.println(vehicle4.model);
        System.out.println(vehicle4.year);
        System.out.println(vehicle4.dailyRate);


    }
}
