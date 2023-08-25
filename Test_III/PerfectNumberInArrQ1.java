package Test_III;

import java.util.Scanner;

public class PerfectNumberInArrQ1 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array : ");
        int[] x = readArr();
        System.out.println("Here perfect number is : ");
        isPerfect(x);
    }

    static void isPerfect(int[] ar) {
    int sum = 0;
    for (int i = 1; i < ar.length; i++) {
    boolean bl = isper(ar[i]);
    if (bl)
    System.out.println(ar[i]);
    }
    }

    static boolean isper(int n) {
    int sum = 0, init = n;
    for (int i = 1; i <= n / 2; i++) {
    if (n % i == 0)
    sum = sum + i;
    }
    if (sum == init)
    return true;
    else
    return false;
    }

    // static void isPerfect(int[] ar) {
    //     int sum = 0;
    //     for (int i = 0; i < ar.length; i++) {
    //         for (int j = 1; j <= ar[i] / 2; j++) {
    //             if (ar[i] %j == 0) {
    //                 sum = sum + j;
    //             }
    //         }
    //         if (sum == ar[i])
    //             System.out.println(ar[i]);
    //     }
    // }

    static int[] readArr() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the " + n + " values : ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    static void display(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(i + " --> " + ar[i]);
        }
        System.out.println();
    }
}
