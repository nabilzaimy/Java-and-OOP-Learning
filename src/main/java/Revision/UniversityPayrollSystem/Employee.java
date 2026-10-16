package Revision.UniversityPayrollSystem;

public class Employee {

    String name;
    double baseSalary;
    static int employeeCount;

    Employee(String name , double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        employeeCount++;
    }

    public double calculatePay(){
        return baseSalary;
    }

    public void showDisplay(){
        System.out.println("Name: " + name + ". Base Pay: RM" + calculatePay());
    }
}
