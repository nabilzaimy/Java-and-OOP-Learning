package OOP.Encapsulation;

public class Car2 {

    private String brand;
    private String name;
    private int year;

    Car2(String brand , String name , int year){
        this.brand = brand;
        this.name = name;
        this.setYear(year);
    }

    public String getBrand(){
        return brand;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }
}
