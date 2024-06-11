package area;

/***
 * @author Mahdi Jamil
 */
public class FEM {

    public static double f(double x) {
        return Math.exp(x);
    }

    public static double FLeft(double a, double b, double h) {

        double result = 0;
        double left = a, right = left + h;

        while (right <= b) {
            System.out.println("Interval [" + left + " , " + right + "]");
            result += h * f(left);
            left = right;
            right += h;
        }
        return result;
    }

    public static double FRight(double a, double b, double h) {

        double result = 0;
        double left = a, right = left + h;

        while (right <= b) {
            System.out.println("Interval [" + left + " , " + right + "]");
            result += h * f(right);
            left = right;
            right += h;
        }
        return result;
    }

    public static double FMin(double a, double b, double h) {

        double result = 0;
        double left = a, right = left + h;

        while (right <= b) {
            System.out.println("Interval [" + left + " , " + right + "]");
            result += h * Math.min(f(left), f(right));
            left = right;
            right += h;
        }
        return result;
    }

    public static double FMax(double a, double b, double h) {

        double result = 0;
        double left = a, right = left + h;

        while (right <= b) {
            System.out.println("Interval [" + left + " , " + right + "]");
            result += h * Math.max(f(left), f(right));
            left = right;
            right += h;
        }
        return result;
    }

    public static double FTrapezoid(double a, double b, double h) {

        double result = 0;
        double left = a, right = left + h;

        while (right <= b) {
            System.out.println("Interval [" + left + " , " + right + "]");
            result += h * ((f(left) + f(right)) / 2);
            left = right;
            right += h;
        }
        return result;
    }

    public static double FMidPoint(double a, double b, double h) {

        double result = 0;
        double left = a, right = left + h;

        while (right <= b) {
            System.out.println("Interval [" + left + " , " + right + "]");
            double midpoint = (left + right) / 2;
            result += h * f(midpoint);
            left = right;
            right += h;
        }
        return result;
    }


}
