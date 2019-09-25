package circle;

public class Circle {
 private double radius;
 private float pie;

 public Circle(double radius, float pie){
     this.radius = radius;
     this.pie = pie;

 }
 public void calculateArea(){
     System.out.println((radius * radius) * pie);
 }
}
