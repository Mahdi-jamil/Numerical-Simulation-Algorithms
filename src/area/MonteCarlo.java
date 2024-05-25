package area;

import java.util.Random;

/***
 * @author Mahdi Jamil
 */
public class MonteCarlo {

    private static boolean isInsideTheShape(double x, double y) {
        return f(x, y) <= 1; // any function represent a shape
    }

    private static double f(double x, double y) {
        return x * x + y * y;
    }

    public static double monteCarlo(int numPoints) {
        Random random = new Random();
        int pointsInsideCircle = 0;

        for (int i = 0; i < numPoints; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            // Check if the point (x, y) is inside the unit shape
            if (isInsideTheShape(x, y)) {
                pointsInsideCircle++;
            }
        }

        double totalArea = 4.0;
        return totalArea * pointsInsideCircle / numPoints;
    }


}
