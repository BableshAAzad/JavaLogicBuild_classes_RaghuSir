package Test_I;

import java.util.Scanner;

public class ArmStrongNosWithinMMandNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N and M :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            boolean bl = isArmStrong(i);
            if (bl == true)
                System.out.print(i + " ");
        }
    }

    static boolean isArmStrong(int i) {
        int sum = 0, intitN = i;
        int dc = digitC(i);
        do {
            int d = i % 10;
            sum = sum + powr(d, dc);
            i = i % 10;
        } while (i != 0);
        return (sum == intitN);
    }

    static int digitC(int i) {
        int count = 0;
        do {
            count++;
            i = i / 10;
        } while (i != 0);
        return count;
    }

    static int powr(int d, int dc) {
        int p = 1;
        while (dc > 0) {
            p = p * d;
            dc--;
        }
        return p;
    }
}
