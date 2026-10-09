package OOP.Static;

public class CurrencyConverter {

    static double usdToEurRate = 0.92;

    static double convertUsdToEur(double usdAmount){
        return usdAmount * usdToEurRate;
    }

    static void updateRate(double newRate){
         usdToEurRate = newRate;

    }
}
