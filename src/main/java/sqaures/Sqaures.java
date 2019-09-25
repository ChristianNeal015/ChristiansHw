package sqaures;

public class Sqaures {
    private double length;
    private double width;

    public Sqaures(double length, double width) {
      this.length = length;
      this.width = width;
    }
    public void calculateArea(){
        System.out.println(length * width);
    }
}
