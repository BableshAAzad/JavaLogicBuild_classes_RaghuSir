package Test_V_NumberSystem;

import java.util.Scanner;

public class FactorialWithinNQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting range : ");
        int n = sc.nextInt();
        System.out.println("Enter ending range : ");
        int m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            int a = facto(i);
            System.out.print(a + " ");
        }
        sc.close();
    }

    static int facto(int n) {
        int f = 1;
        while (n > 1) {
            f = f * n;
            n--;
        }
        return f;
    }
}
