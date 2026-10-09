package OOP.Static;

public class Main8 {

    public static void main(String[] args){

//        CurrencyConverter.convertUsdToEur(100);

        System.out.println(CurrencyConverter.convertUsdToEur(100) + " EUR");

        CurrencyConverter.updateRate(0.95);

        System.out.println(CurrencyConverter.convertUsdToEur(100) + "EUR");
    }
}
