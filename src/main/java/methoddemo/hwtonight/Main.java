package methoddemo.hwtonight;

import java.util.Scanner;
public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Scanner sc;
        double x, y, z;
        sc = new Scanner(System.in);
        System.out.println("Enter sides of your triangle");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
//        double width, height;
        sc = new Scanner(System.in);
//        System.out.println("what is the width of your rectangle?");
//        width = sc.nextDouble();
//        System.out.println("what is the height of your rectangle?");
//        height = sc.nextDouble();


//        AreaOfRectangle(width, height);
        System.out.format("The Area of triangle");
    }
    private static void AreaOfRectangle(double width, double height ) {
        double Area;
        Area = width * height;
        System.out.println("the area of your rectangle = " + Area);
    }
    public static double AreaOfTriangle(double a, double b, double c ){
    double triangle;
        triangle = (a + b + c) / 2;
        System.out.println("The area of your triangle is " + triangle);
        return triangle;
    }
}


