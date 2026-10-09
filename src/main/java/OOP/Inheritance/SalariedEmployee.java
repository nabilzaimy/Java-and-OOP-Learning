package OOP.Inheritance;

public class SalariedEmployee extends Employee {

    double salary;

//    super pula bukan method, tapi kata kunci (keyword) untuk memanggil constructor atau method asal milik parent class.

    SalariedEmployee(String names , int employeeId , double salary){
        super(names,employeeId);
        this.salary = salary;
    }

    @Override
    public String toString(){
        return super.toString() + "Salary: " + salary;
    }
}
