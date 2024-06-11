package area;

import java.util.Random;

/***
 * @author Mahdi Jamil
 */
public class MonteCarlo {

    private static double f(double x) {
        return x * x;
    }

    public static double enhancedMonteCarlo(double a, double b) {
        Random random = new Random();
        double sum = 0;
        int N = 30; // Choose N uniformly and randomly distributed points 𝑥𝑖 inside [𝑎, 𝑏]
        for (int i = 0; i < N; i++) {
            sum += f(random.nextDouble(a, b));
        }
        return ((b - a) / N) * sum;
    }


}
