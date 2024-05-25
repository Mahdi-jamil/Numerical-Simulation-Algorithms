package area;

/***
 * @author Mahdi Jamil
 */
public class Main {


    public static void main(String[] args) {
        int numPoints = 1000000; // Number of points to generate
        int n = 2, a = 0, b = 1;
        double h = (double) (b - a) / n;
        double actualValue = 1.718281828;


        double area = MonteCarlo.monteCarlo(numPoints);
        System.out.println("MonteCarlo value : " + area);

        area = FEM.FLeft(a, b, h);
        System.out.println("Always Left Method Area = " + area + " With Error " + Math.abs(area - actualValue) + "\n");

        area = FEM.FRight(a, b, h);
        System.out.println("Always Right Method Area = " + area + " With Error " + Math.abs(area - actualValue) + "\n");

        area = FEM.FMin(a, b, h);
        System.out.println("Min Method Area = " + area + " With Error " + Math.abs(area - actualValue) + "\n");

        area = FEM.FMax(a, b, h);
        System.out.println("Max Method Area = " + area + " With Error " + Math.abs(area - actualValue) + "\n");

        area = FEM.FMidPoint(a, b, h);
        System.out.println("Midpoint Method Area = " + area + " With Error " + Math.abs(area - actualValue) + "\n");

        area = FEM.FTrapezoid(a, b, h);
        System.out.println("Trapezoid Method Area = " + area + " With Error " + Math.abs(area - actualValue) + "\n");
    }

}
