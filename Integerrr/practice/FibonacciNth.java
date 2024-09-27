package Integerrr.practice;

public class FibonacciNth {
    public static void main(String[] args) {
        int n = 5; // 5th fibonacci number is : 3
        // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
        int res = nthFibonacci(n);
        System.out.println(n+"th fibonacci number is : "+res);
    }
    static int nthFibonacci(int n) {
        int f1 = 0, f2 = 1;
        while (n > 1) {
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            n--;
        }
        return f1;
    }
}
