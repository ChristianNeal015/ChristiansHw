package sqaures;

public class Sqaures {
    public double length;
    public double width;

    public Sqaures(double length, double width) {
      this.length = length;
      this.width = width;
    }
    public void calculateArea(){
        System.out.println(length * width);
    }
}
