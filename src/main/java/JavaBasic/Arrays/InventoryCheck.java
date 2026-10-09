package JavaBasic.Arrays;

public class InventoryCheck {

    public static void main(String[] args){

        int lowStockLevels = 0;
        int[] stockLevels = {15,8,22,0,4,12,3};

        for(int item = 0 ; item < stockLevels.length ; item++){

            if(stockLevels[item] == 0){
                System.out.println("CRITICAL: Item " + item + " IS OUT OF STOCK !");

            }
            if(stockLevels[item] < 10){
                System.out.println("Alert: Item" + item + " is low on stock! Current count: " + item);
                lowStockLevels++;

            }
        }

        System.out.println("Total Low Stocks Item: " + lowStockLevels);
    }
}
