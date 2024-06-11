package root;

import static root.Functions.fx;

/***
 * @author Mahdi Jamil
 */
public class bisection {

    public static double fx(double x) {
        return Math.exp(x) - Math.pow((2 - x), 3);
    }

    public static double dfx(double x) {
        return Math.exp(x) + 3 * Math.pow(2 - x, 2);
    }
    public static double bisection(double left, double right, double eps) {
        if (fx(left) * fx(right) >= 0) {
            System.out.println("You have not assumed right left and right ");
            return -1;
        }
        
        int N = (int)Math.floor((Math.log(right-left)-Math.log(eps))/Math.log(2));
        int i=0;
        
        double middle = (left + right) / 2;

        while (Math.abs(fx(middle)) > eps && i<=N) {
            middle = (left + right) / 2;

            if (fx(middle) == 0) break;

            right = (fx(left) * fx(middle) < 0) ? middle : right;
            left = (fx(left) * fx(middle) < 0) ? left : middle;
            i++;

        }
        return middle;
    }
}