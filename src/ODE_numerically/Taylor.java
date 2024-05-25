package ODE_numerically;

import static ODE_numerically.Functions.fx;
import static ODE_numerically.Functions.dfx;

/***
 * @author Mahdi Jamil
 */
public class Taylor {

    public static double euler(int n, double h, double x0, double t0) {
        double xk = x0, tk = t0;

        for (int i = 0; i < n; i++) {
            xk = xk + h * fx(tk, xk);
            tk = tk + h;
        }
        return xk;
    }

    public static double quadratic(int n, double h, double x0, double t0) {
        double xk = x0, tk = t0;

        for (int i = 0; i < n; i++) {
            xk = xk + h * fx(tk, xk) + (Math.pow(h, 2) / 2) * dfx(tk, xk);
            tk = tk + h;
        }
        return xk;
    }
}
