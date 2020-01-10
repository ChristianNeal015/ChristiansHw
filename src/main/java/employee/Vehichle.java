package employee;

public class Vehichle {
    private double wheels;
    protected String name;

    public Vehichle(double wheels, String name) {
        this.wheels = wheels;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehichle{" +
                "wheels=" + wheels +
                ", name='" + name + '\'' +
                '}';
    }

    public double getWheels() {
        return wheels;
    }

    public void setWheels(double wheels) {
        this.wheels = wheels;
    }
}
