package triangle;

public class Triangle {
    public double radius;

    public Triangle(double side1, double side2, double side3){
    this.radius = side1;
    this.radius = side2;
    this.radius = side3;

    }
    public void calculatePerimeter(){
        System.out.println(radius + radius + radius);

    }
}
