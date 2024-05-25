package root;

public class Main {

    public static void main(String[] args) {
        double a = 0.0;  // Left endpoint of interval
        double b = 1.0;  // Right endpoint of interval
        double eps = 1e-6;  // Tolerance

        double x0 = 2.5; // Newton initial guess
        int maxIteration = 1000;

        try {
            double root = Bisection.bisection(a, b, eps);
            System.out.println("Bisection Root: " + root);

            root = Newton.newton(x0, eps, maxIteration);
            System.out.println("Newton root = " + root);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

}