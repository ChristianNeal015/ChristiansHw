package CalcEngine;

public class Main {
    public static void Main(String[] args) {
        double[] leftVal = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVal = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation();
        for (int i = 0; i < opCodes.length; i++) {

        }
        for (double theResult : results) {
            System.out.println("results = ");
            System.out.println(theResult);
        }
    }

    public static void create(double leftVal, double rightVal, char opCodes) {
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
    }

}
