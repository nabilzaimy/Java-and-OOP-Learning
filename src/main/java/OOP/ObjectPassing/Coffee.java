package OOP.ObjectPassing;

public class Coffee {

    String order;
    boolean hasSugar;

    Coffee(String order){
        this.order = order;
        this.hasSugar = false;
    }

    public void setSugar(boolean hasSugar){
        this.hasSugar = hasSugar;
    }

}
