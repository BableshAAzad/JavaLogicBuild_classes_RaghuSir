package Test_V_NumberSystem;

import java.util.Scanner;

public class FabonaciSeriesWithinNQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        fabon(n);
        sc.close();
    }

    static void fabon(int n) {
        int f1 = 0, f2 = 1;
        do {
            System.out.print(f1+" ");
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            n--;
        } while (n > 0);
    }
}
