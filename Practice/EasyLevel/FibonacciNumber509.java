package Practice.EasyLevel;

public class FibonacciNumber509 {
    public static int fib(int n) {
        if(n == 1)
          return 1;
        int f1 = 0, f2 = 1, f3 = 0;
        while (n > 1) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            n--;
        }
        return f3;
    }

    public static void main(String[] args) {
        int n = 1;
        int rs = fib(n);
        System.out.println(rs);
    }
}
/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the
 * Fibonacci sequence, such that each number is the sum of the two preceding
 * ones, starting from 0 and 1. That is,
 * 
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 * 
 * Example 1:
 * 
 * Input: n = 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 * Example 2:
 * 
 * Input: n = 3
 * Output: 2
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 * Example 3:
 * 
 * Input: n = 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 */