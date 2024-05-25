package root;

import static root.Functions.dfx;
import static root.Functions.fx;

/***
 * @author Mahdi Jamil
 */
public class Newton {

    public static double newton(double x0, double tolerance, int maxIteration) {
        for (int i = 0; i < maxIteration; i++) {
            double fx = fx(x0);
            double dfx = dfx(x0);

            if (dfx == 0) {
                throw new ArithmeticException("Derivative is zero. No solution found.");
            }

            double x1 = x0 - fx / dfx;
            System.out.println("x1 = " + x1);

            if (Math.abs(x1 - x0) < tolerance) return x1;
            x0 = x1;
        }
        throw new RuntimeException("Maximum number of iterations reached. No solution found.");

    }

}
