package Integerrr;

import java.util.Scanner;

public class BiggestDigitInTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int n = sc.nextInt();
        int a = 0, b = n;
        while (n != 0) {
            int d = n % 10;
            if (d > a)
                a = d;
            n = n / 10;
        }
        System.out.println(a + " is a biggest digit in " + b);
    }
}
