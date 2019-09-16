package employee;

public class Employee {

    public String name;
    public float hoursWorked;
    public double hourlyRates;

    public Employee(String name, float hoursWorked, double hourlyRates){
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRates = hourlyRates;
}
    public void calculatePay(){
        System.out.println(hourlyRates * hoursWorked);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", hourlyRates=" + hourlyRates +
                '}';
    }


}
