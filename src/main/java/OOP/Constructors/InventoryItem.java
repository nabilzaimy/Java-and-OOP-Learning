package OOP.Constructors;

public class InventoryItem {

    String itemId;
    String name;
    int quantity;
    double weightPerUnit;

    InventoryItem(String itemId , String name , int quantity , double weightPerUnit){

        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.weightPerUnit = weightPerUnit;
    }

    InventoryItem(String itemId , String name){
        this.itemId = itemId;
        this.name = name;
    }

    void restock(int amount){
        int newQuantity = amount + this.quantity;
        System.out.println(this.name + " restocked " + amount + ". New Quantity: " + newQuantity);
    }

    double totalWeight(){
        double sumWeight = this.quantity * this.weightPerUnit;
        return totalWeight();
    }

    void displayDetails(){
        System.out.println(this.itemId + " " + this.name + ": " + this.quantity
                + "units | Total Weight: " + this.totalWeight() + " kg.");
    }
}
