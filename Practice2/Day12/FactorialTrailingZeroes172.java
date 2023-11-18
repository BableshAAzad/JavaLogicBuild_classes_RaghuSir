package Practice2.Day12;

public class FactorialTrailingZeroes172 {
    // public static int trailingZeroes(int n) {
    //     int count = 0;
    //     long fact = 1;
    //     while (n > 0) {
    //         fact = fact * n;
    //         n--;
    //     }
    //     System.out.println(fact);
    //     do {
    //         long d = fact % 10;
    //         if (d == 0) {
    //             count++;
    //         } else if (d != 0)
    //             break;
    //         fact = fact / 10;
    //     } while (fact > 0);
    //     return count;
    // }

    static int getCount(int n) {
        int count = 0;
        int pow = 5;
        while (n >= pow) {
            count = count + n / pow;
            pow = pow * 5;
        }
        // System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        // int n = 5; // 1
        // int n = 3; // 0
        // int n = 0; // 0
        int n = 30; // 2
        // int res = trailingZeroes(n);
        // System.out.println(res);
        getCount(n);
    }
}
/*
 * Given an integer n, return the number of trailing zeroes in n!.
 * Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.
 * 
 * Example 1:
 * 
 * Input: n = 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * 
 * Example 2:
 * 
 * Input: n = 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * 
 * Example 3:
 * 
 * Input: n = 0
 * Output: 0
 */