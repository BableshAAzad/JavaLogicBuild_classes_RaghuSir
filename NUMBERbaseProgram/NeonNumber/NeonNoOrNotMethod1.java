package NUMBERbaseProgram.NeonNumber;

import java.util.Scanner;

public class NeonNoOrNotMethod1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        boolean bl = isNeon(n);
        if (bl)
            System.out.println(n + " is a Neon number");
        else
            System.out.println(n + " is not a Neon number");
        sc.close();
    }

    static boolean isNeon(int n) {
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
