package NUMBERbaseProgram.SunnyNumber;

import java.util.Scanner;

public class SunnyNoOrNotMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        boolean bl = isSunnyNum(n);
        if (bl)
            System.out.println(n + " is a Sunny number");
        else
            System.out.println(n + " is not a Sunny number");
        sc.close();
    }

    static boolean isSunnyNum(int n) {
        int m = n + 1;
        for (int i = 1; i <= m / 2; i++) {
            if (i * i == m)
                return true;
        }
        return false;
    }
}
