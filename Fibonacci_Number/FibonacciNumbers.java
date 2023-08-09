package Fibonacci_Number;

import java.util.Scanner;

public class FibonacciNumbers {
    static int isPhebo(int n) {
        int f1 = 0, f2 = 1;
        while (n > 1) {
            System.out.print(f1 + " ");
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            n--;
        }
        return f1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number : ");
        int n = sc.nextInt();
        int fb = isPhebo(n);
        System.out.println(fb + " ");
    }
}
