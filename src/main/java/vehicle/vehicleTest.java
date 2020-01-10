package vehicle;

public class vehicleTest {
    public static void main(String[] args) {
        Car car1 = new Car(3, "Leather");
        car1.engineType = "V8";
        System.out.println(car1.engineType);
        System.out.println(car1);
    }
}
