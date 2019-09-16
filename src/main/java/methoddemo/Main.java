package methoddemo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double width, height;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Please Enter the Width of a Rectangle =  ");
        width = sc.nextDouble();
        System.out.println("\n Please Enter the Height of a Rectangle = ");
        height = sc.nextDouble();

        AreaOfRectangle(width, height);

//        discountCalc(100, 10);
//        //double outof = 100.00;
//        double discount = .50;
//        double z = 29.99;
//
//        double finalprice = multiply(discount, z);
    /*   double idc = multiply(x, discount);
        double cdi = subtract(outof, discount);
        double cef = addition(outof,discount);
        double inf = division(outof,discount);
       System.out.println(idc);
        System.out.println(cdi);
        System.out.println(cef);
        System.out.println(inf);*/
//        System.out.println(finalprice);
    }

    //    public static void discountCalc(double productPrice, double discAmount){
//
//
//    double discount = discAmount * productPrice / 100;
//    double answer = productPrice - discount;
//        System.out.println(answer);
//
//    }
    public static void areaOfACircle(double area, double radius){
        double pi = 3.14;
        area = pi * radius * radius;
        double equal = area * radius * radius;
        System.out.println(equal);
    }
    public static void AreaOfRectangle( double width, double height ) {
        double Area, Perimeter;

        Area = width * height;
        Perimeter = 2 * (width + height);

        System.out.format("\n The Area of a Rectangle = %.2f\n",Area);
        System.out.format("\n The Perimeter of a Rectangle = %.2f\n", Perimeter);
    }
//        public static double multiply(double x, double y){
//        return x*y;
//        }
//        public static double division(double x, double y){
//        return x / y;
//        }
//        public static double subtract(double x, double y){
//        return x - y;
//        }
////        public static double multiply(double x, double y){
////        return  x * y;
////        }
//        public static double addition(double x, double y){
//        return x + y;
        }






