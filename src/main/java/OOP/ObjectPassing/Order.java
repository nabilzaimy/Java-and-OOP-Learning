package OOP.ObjectPassing;

/*
Task: Order Management System Refactoring

You are developing an e-commerce inventory tool. Define a primitive variable double basePrice = 150.00; and a reference
variable Double targetPrice = Double.valueOf(basePrice);. Next, create a custom class named Order that holds two fields:
an int orderId and a double totalAmount. Instantiation an Order object with an ID of 101 and a total amount equal to basePrice.

Now, create a method processDiscount(double price, Order order) that takes a primitive double and an Order reference.
Inside this method:

Reassign price = price * 0.8;

Update the order object's field: order.totalAmount = order.totalAmount * 0.8;

Reassign the reference parameter itself to a brand new object: order = new Order(999, 0.0);

Pass basePrice and your original Order instance into processDiscount. Write down what the values of basePrice,
targetPrice, and your original Order object's totalAmount will be after the method execution finishes, explaining how
Java's pass-by-value mechanism applies to both primitive types and reference types in memory.
 */

//public class Order{
//
//    double basePrice = 150.0;
//    Double targetPrice = Double.valueOf(basePrice);
//
//    int orderID = 101;
//    double totalAmount = basePrice;
//
//    public static void processDiscount(double price, Order order){
//
//        price = price * 0.8;
//        order.totalAmount = order.totalAmount * 0.8;
//        order = new Order(999, 0.0);
//
//    }
//}
