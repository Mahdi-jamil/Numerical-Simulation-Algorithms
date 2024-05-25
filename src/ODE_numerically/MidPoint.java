package ODE_numerically;

import static ODE_numerically.Functions.fx;

/***
 * @author Mahdi Jamil
 */
public class MidPoint {

    public static double midPoint(int n, double h, double x0, double t0) {
        double xk = x0, tk = t0;

        for (int i = 0; i < n; i++) {
            double xkMiddle = xk + h / 2 * fx(tk, xk);
            xk = xk + h * fx(tk + h / 2, xkMiddle);
            tk += h;
        }
        return xk;
    }

}
