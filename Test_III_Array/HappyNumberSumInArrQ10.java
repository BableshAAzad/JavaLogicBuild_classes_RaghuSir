package Test_III_Array;

import java.util.Scanner;

public class HappyNumberSumInArrQ10 {
    public static void main(String[] args) {
        int[] ar = readArray();
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            boolean bl = happNumOrNot(ar[i]);
            if (bl)
                sum = sum + ar[i];
        }
        System.out.println("Sum of happy numbers is : " + sum);
    }

    static boolean happNumOrNot(int n) {
        while (n > 9) {
            int sum = 0;
            do {
                int d = n % 10;
                sum = sum + d * d;
                n = n / 10;
            } while (n != 0);
            n = sum;
        }
        if (n == 1 || n== 7)
            return true;
        return false;
    }

    static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the " + n + " values : ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        sc.close();
        return ar;
    }
}
