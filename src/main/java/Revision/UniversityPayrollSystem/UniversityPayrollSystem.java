package Revision.UniversityPayrollSystem;

public class UniversityPayrollSystem {

    // Chapters Covered: Chapters 39 (OOP), 42 (Array of Objects), 43 (static),
    // 44 (Inheritance), 45 (super), alongside loops and method overriding.

    // Real-World Scenario: A university manages multiple types of employees (
    // Full-time Professors and Hourly Lecturers). The system uses inheritance,
    // super keyword construction chaining, method overriding, an Array of Objects,
    // and a static tracking variable to keep a running total of active staff members across the campus.

    public static void main(String[] args){

        Employee employee1 = new Employee("Nabil" , 1500);
        Employee employee2 = new Professor("Aliaa" , 4500 , 200);
        Employee employee3 = new Professor("Nail" , 20000 , 200);

        Employee[] employees = {employee1 , employee2 , employee3};

        for(int i = 0 ; i < employees.length ; i++){
            employees[i].showDisplay();
        }

        System.out.println(Employee.employeeCount);

    }
}
