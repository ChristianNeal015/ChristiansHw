package vehicle;

public class Car extends Vehicle {
    private String interior;

    public Car(double doors, String interior) {
        super(doors);
        this.interior = interior;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "Car{" +
                "interior ='" + interior + '\'' +
                '}';
    }
}

