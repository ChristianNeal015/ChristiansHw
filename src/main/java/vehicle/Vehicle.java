package vehicle;

public class Vehicle {
    private double doors;
    protected String engineType;


    public Vehicle(double doors){
        this.doors = doors;
    }

    public double getDoors() {
        return doors;
    }

    public void setDoors(double doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "doors=" + doors +
                '}';
    }
}
