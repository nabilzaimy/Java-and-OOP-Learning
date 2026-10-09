package OOP.Inheritance;

public class Employee {

    String name;
    int employeedId;

    Employee(String name, int employeedId){
        this.name = name;
        this.employeedId = employeedId;
    }

    @Override
    public String toString(){
        String myString = "ID: " + employeedId + " | " + "Name: " + name + " | ";
        return myString;
    }
}
