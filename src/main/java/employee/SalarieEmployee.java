package employee;


import java.time.LocalDate;

public abstract class SalarieEmployee extends Employee {
    private double yearlySalary;
    public LocalDate hiredate;
    public Personality personality;
    public Cars car2;

    public SalarieEmployee(String name, float hoursWorked, double yearlySalary, LocalDate hiredate, Personality personality, Cars car2) {
        super(name, hoursWorked);
        this.yearlySalary = yearlySalary;
        this.hiredate = hiredate;
        this.personality = personality;
        this.car2 = car2;

    }

    @Override
    public void printProfile() {
        System.out.println("I am a salarie employee");
    }

    @Override
    public String toString() {
        return "SalarieEmployee{" +
                "yearlySalary=" + yearlySalary +
                ", hiredate=" + hiredate +
                ", personality=" + personality +
                ", car2=" + car2 +
                ", sex=" + sex +
                '}';
    }

    @Override
    public void calculatePay() {
        System.out.println(this.yearlySalary);
    }
}


