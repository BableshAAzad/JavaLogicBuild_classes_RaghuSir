package Test_I;

import java.util.Scanner;

public class StrongNosWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interger value :");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            boolean bl = isStrong(i);
            if (bl)
                System.out.print(i + " ");
        }
    }

    static boolean isStrong(int n) {
        int sum = 0, initN = n;
        do {
            int d = n % 10;
            sum = sum + facto(d);
            n = n / 10;
        } while (n > 0);
        return (sum == initN);
    }

    static int facto(int d) {
        int f = 1;
        while (d > 0) {
            f = f * d;
            d--;
        }
        return f;
    }
}
