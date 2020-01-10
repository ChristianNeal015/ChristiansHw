package employee;

import vehicle.Vehicle;

public class Cars extends Vehicle {

    public Cars(double doors) {
        super(doors);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}

