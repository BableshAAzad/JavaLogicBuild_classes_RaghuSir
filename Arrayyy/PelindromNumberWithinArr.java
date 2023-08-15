package Arrayyy;

import java.util.Scanner;

public class PelindromNumberWithinArr {
    public static void main(String[] args) {
        PelindromNumberWithinArr dn = new PelindromNumberWithinArr();
        int[] x = dn.readArray();
        System.out.println("There palindrome numeber is : ");
        dn.printPalindrom(x);
        int r = dn.countPalindm(x);
        System.out.println("There total palindrome numeber is : " + r);
    }

    int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    int countPalindm(int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            boolean bl = getPalindrom(ar[i]);
            if (bl)
                count++;
        }
        return count;
    }
    void printPalindrom(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            boolean bl = getPalindrom(ar[i]);
            if (bl)
                System.out.println(ar[i]);
        }
    }

    boolean getPalindrom(int n) {
        int temp = n, sum = 0;
        do {
            int d = n % 10;
            sum = sum * 10 + d;
            n = n / 10;
        } while (n != 0);
        return (sum == temp);
    }
}
