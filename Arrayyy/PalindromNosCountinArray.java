package Arrayyy;

import java.util.Scanner;

public class PalindromNosCountinArray {
    public static void main(String[] args) {
        int[] ar = readArray();
        palindromeCount(ar);
    }

    static void palindromeCount(int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            boolean bl = isPalindrome(ar[i]);
            if (bl)
                count++;
        }
        System.out.println("Total " + count + " palindrom numbers present");
    }

    static boolean isPalindrome(int n) {
        int rev = 0;
        for (int i = 0; i < n; i++) {
            int mn = n;
            do {
                int d = n % 10;
                rev = rev * 10 + d;
                n = n / 10;
            } while (n > 0);
            if (mn == rev)
                return true;
        }
        return false;
    }

    static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " Values : ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }
}
