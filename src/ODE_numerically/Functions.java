package ODE_numerically;

public final class Functions {

    public static double fx(double t, double x) {
        return Math.pow(t, 2) + Math.pow(x, 3) - x; // t^2 + x^3 -x
    }

    public static double dfx(double t, double x) {
        return 2 * t + 3 * Math.pow(x, 2) * fx(t, x) - fx(t, x);
    }

    private Functions(){}
}
