package NUMBERbaseProgram.SunnyNumber;

import java.util.Scanner;

public class SunnyNoOrNotMethod1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int m = n + 1;
        boolean bl = isSunny(m);
        if (bl)
            System.out.println(n + " is a Sunny number");
        else
            System.out.println(n + " is not a Sunny number");
        sc.close();
    }

    static boolean isSunny(int n) {
        double sqr = sqrRoot(n);
        int y = (int) sqr;
        if (sqr % y == 0)
            return true;
        else
            return false;
    }

    static double sqrRoot(int n) {
        double t = 0;
        double sq = n / 2;
        do {
            t = sq;
            sq = (t + (n / t)) / 2;
        } while ((t - sq) != 0);
        return sq;
    }
}
