package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        HashMap<String,Double> cars = new HashMap<>();

        cars.put("Honda",299.99);
        cars.put("Passo",199.99);
        cars.put("Serena",899.99);
        cars.put("Myvi",4000.99);

//        System.out.println(cars.get("Honda"));

        for(String i : cars.keySet()){
            System.out.println("Key: " + i + " | Value: " + cars.get(i));
        }
    }
}
