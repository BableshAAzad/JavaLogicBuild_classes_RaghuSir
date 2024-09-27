package Integerrr.practice;

import java.util.Scanner;

public class TwoOfPowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Enter value : ");
        int n = sc.nextInt();
        int res = twoOfPow(n);
        System.out.println("2 of power " + n + " is : " + res);
        sc.close();
    }

    static int twoOfPow(int n) {
        System.out.println("----------------");
        int res = 1;
        while (n > 0) {
            res = res * 2;
            System.out.println(n);
            n--;
        }
        return res;
    }

    // Enter a Enter value :
    // 3
    // ----------------
    // 3
    // 2
    // 1
    // 2 of power 3 is : 8
}
