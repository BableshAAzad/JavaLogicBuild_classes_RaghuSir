package NUMBERbaseProgram.NeonNumber;

import java.util.Scanner;

public class NeonNoOrNotMethod2 {
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
        for (int i = 1; i <= n / 2; i++) {
            if (i * i == n)
                return true;
        }
        return false;
    }
}
