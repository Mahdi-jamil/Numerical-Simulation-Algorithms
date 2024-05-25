package ODE_numerically;

import static ODE_numerically.Functions.fx;

public class RangeKutta {

    public static double rangeKutta(int n, double h, double x0, double t0) {
        double xk = x0, tk = t0;

        for (int i = 0; i < n; i++) {
            double k0 = fx(tk, xk);
            double k1 = fx(tk + h / 2, xk + h / 2 * k0);
            double k2 = fx(tk + h / 2, xk + h / 2 * k1);
            double k3 = fx(tk + h, xk + h * k2);

            xk = xk + (h / 6) * (k0 + 2 * k1 + 2 * k2 + k3);
            tk += h;
        }
        return xk;
    }

}
