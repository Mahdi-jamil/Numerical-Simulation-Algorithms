package root;

/***
 * @author Mahdi Jamil
 */
public class Functions {
    private Functions() {}

    public static double fx(double x) {
        return Math.exp(x) - Math.pow((2 - x), 3);
    }

    public static double dfx(double x) {
        return Math.exp(x) + 3 * Math.pow(2 - x, 2);
    }
}
