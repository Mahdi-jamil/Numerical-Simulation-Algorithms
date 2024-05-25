package root;

import static root.Functions.fx;

public class Bisection {

    public static double bisection(double left, double right, double eps) {
        if (fx(left) * fx(right) >= 0) {
            System.out.println("You have not assumed right a and b ");
            return -1;
        }

        double middle = (left + right) / 2;

        while (Math.abs(fx(middle)) > eps) {
            middle = (left + right) / 2;

            if (fx(middle) == 0) break;

            right = (fx(left) * fx(middle) < 0) ? middle : right;
            left = (fx(left) * fx(middle) < 0) ? left : middle;

        }
        return middle;
    }



}
