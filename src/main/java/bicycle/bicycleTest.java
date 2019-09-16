package bicycle;

public class bicycleTest {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle(5, 5, 5);
        bike1.applyBrake(7);
        System.out.println(bike1.speed);
        bike1.speedUp(6);
        System.out.println(bike1.speed);
    }
}
