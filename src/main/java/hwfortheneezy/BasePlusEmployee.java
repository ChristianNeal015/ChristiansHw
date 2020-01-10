package hwfortheneezy;

public class BasePlusEmployee extends CommissionedEmployee {
    private double baseSalary;


    public BasePlusEmployee(String firstName, String lastName, String employeeId, double grossSales, double commisionRate, double baseSalary) {
        super(firstName, lastName, employeeId, grossSales, commisionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double paycheck(double baseSalary) {
        return commisionRate * grossSales + baseSalary
    }
}
