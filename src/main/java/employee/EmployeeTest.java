package employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Dude", 34.5f, 30.0);
        employee.setHoursWorked(46.6f);
        employee.getHoursWorked();
        System.out.println(employee.getHoursWorked());


//        int x = 10;
//
//        Employee employee1 = new Employee("Christian", 40.0f, 20.00);
//        System.out.println(employee1.getHourlyRates());
//        employee1.calculatePay();
    }
}
