package OOP.ArrayOfObjects;

public class ArrayOfObject {

    public static void main(String[] args){

    Product[] p1 = new Product[3];
    p1[0]=new Product(101,"Mouse",200.00,1);
    p1[1]=new Product(102,"Shirt",53.00,2);
    p1[2]=new Product(103,"Pen",5.00,4);

    double totalCartValue = 0;

    for(int i = 0 ; i < p1.length ; i++){
        double itemTotal = p1[i].getTotalPrice();
        totalCartValue += itemTotal;

        System.out.println("ID: " + p1[i].id +
                " | Name: " + p1[i].name +
                " | Price: $" + p1[i].price +
                " | Qty: " + p1[i].quantity +
                " | Total: $" + itemTotal);
    }

        System.out.println("------------------");
        System.out.println("Grand Total: $" + totalCartValue);
    }
}
