package employee;

public class Employee extends Person {

    private float hoursWorked;
    private double hourlyRates;

    public double getHourlyRates() {
        return hourlyRates;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRates(double hourlyRates){
        this.hourlyRates = hourlyRates;
    }

    public Employee(String name, float hoursWorked, double hourlyRates){
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRates = hourlyRates;
}
    public void calculatePay(){
        System.out.println(hourlyRates * hoursWorked);
    }
    public double calculatePay(int maxHours){
        if(maxHours > 40){
            return 0.00;
        }else {
            return hourlyRates * hoursWorked;
        }
    }




}
