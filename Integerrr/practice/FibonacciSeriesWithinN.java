package Integerrr.practice;

import java.util.Arrays;

public class FibonacciSeriesWithinN {
    public static void main(String[] args) {
        int n = 6; // [0, 1, 1, 2, 3, 5]
        int[] res = fibonacci(n);
        System.out.println(Arrays.toString(res));
    }

    static int[] fibonacci(int n) {
        int f1 = 0, f2 = 1, i = 0;
        int[] res = new int[n];
        while (n > 0) {
            res[i++] = f1;
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            n--;
        }
        return res;
    }
}
