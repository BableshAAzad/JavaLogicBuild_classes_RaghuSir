package Test_III_Array;

import java.util.Scanner;

public class DeseriumNosInArrayQ7 {

    public static void main(String[] args) {
        int[] ar = readArray();
        System.out.println("Here deserium numbers is : ");
        for (int i = 0; i < ar.length; i++) {
            boolean bl = isDeserium(ar[i]);
            if (bl)
                System.out.print(ar[i] + " ");
        }
    }

    private static boolean isDeserium(int n) {
        int dc = countDigit(n);
        int sum = 0, init = n;
        do {
            int d = n % 10;
            sum = sum + powerD(d, dc);
            dc--;
            n = n / 10;
        } while (n != 0);
        return sum == init;
    }

    private static int powerD(int d, int dc) {
        int p = 1;
        while (dc > 0) {
            p = p * d;
            dc--;
        }
        return p;
    }

    private static int countDigit(int n) {
        int count = 0;
        do {
            count++;
            n = n / 10;
        } while (n != 0);
        return count;
    }

    static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        sc.close();
        return ar;
    }
}
