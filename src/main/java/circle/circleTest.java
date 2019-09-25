package circle;

public class circleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, 3.14f);
        Circle circle2 = new Circle(6.0, 3.14f);
        circle1.calculateArea();
        circle2.calculateArea();
    }
}
