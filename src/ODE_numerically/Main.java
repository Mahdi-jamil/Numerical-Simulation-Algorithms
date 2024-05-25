package ODE_numerically;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        double a = 0;
        double b = 1;
        double h = (b - a) / n;
        double x0 = 1;
        double t0 = 0;

        double euler = Taylor.euler(n, h, x0, t0);
        System.out.println("euler = " + euler);

        double quadratic = Taylor.quadratic(n, h, x0, t0);
        System.out.println("quadratic = " + quadratic);

        double midpoint = MidPoint.midPoint(n, h, x0, t0);
        System.out.println("midpoint = " + midpoint);

        double rangeKutta = RangeKutta.rangeKutta(n, h, x0, t0);
        System.out.println("rangeKutta = " + rangeKutta);


    }

}
