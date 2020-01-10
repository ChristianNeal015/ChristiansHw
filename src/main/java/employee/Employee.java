package employee;

public abstract class Employee extends Person implements Ipay {
    private float hoursWorked;



    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Employee(String name, float hoursWorked){
        super(name);
        this.hoursWorked = hoursWorked;
}
    @Override
    public String toString(){
        return "Employee name is : " + getName();
    }

    public abstract void calculatePay();


    public void printYearlyHours(){
        System.out.println(hoursWorked * 52);
    }

}






