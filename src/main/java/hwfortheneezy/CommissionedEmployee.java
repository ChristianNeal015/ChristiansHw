package hwfortheneezy;

public class CommissionedEmployee extends Employee {
    private double grossSales;
    private double commisionRate;

    public CommissionedEmployee(String firstName, String lastName, String employeeId, double grossSales, double commisionRate) {
        super(firstName, lastName, employeeId);
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }

    @Override
    public double paycheck() {
        return commisionRate * grossSales;
    }
}
