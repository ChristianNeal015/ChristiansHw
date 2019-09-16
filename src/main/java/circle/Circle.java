package circle;

public class Circle {
 public double radius;
 public float pie;

 public Circle(double radius, float pie){
     this.radius = radius;
     this.pie = pie;

 }
 public void calculateArea(){
     System.out.println((radius * radius) * pie);
 }
}
