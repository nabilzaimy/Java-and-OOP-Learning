package OOP.Constructors;

public class Main4 {

    public static void main(String[] args)
    {
        InventoryItem item1 = new InventoryItem("ITM-01" , "Industrial Drill" ,
                15 , 2.4);
        InventoryItem item2 = new InventoryItem("ITM-02" , "Safety Goggles");

        System.out.println(" ");

        item1.displayDetails();
        item2.displayDetails();

        item2.restock(24);
        item2.displayDetails();
    }
}
