package Revision.UniversityPayrollSystem;

public class Professor extends Employee{

    double researchStipend;

    Professor(String name , double baseSalary , double researchStipend) {
        super(name,baseSalary);
        this.researchStipend = researchStipend;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + researchStipend;
    }

    @Override
    public void showDisplay(){
        System.out.println("Research Stipend: " + researchStipend + ". Base Pay: " + baseSalary + ". Total Pay: " + calculatePay());
    }
}
