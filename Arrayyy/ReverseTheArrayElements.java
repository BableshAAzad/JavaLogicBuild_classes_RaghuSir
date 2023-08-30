package Arrayyy;

import java.util.Scanner;

public class ReverseTheArrayElements {
    public static void main(String[] args) {
        ReverseTheArrayElements ra = new ReverseTheArrayElements();
        int[] x = ra.readArray();
        System.out.println("Reverse of array is : ");
        for (int i = 0; i < x.length; i++) {
            x[i] = revElements(x[i]);
            System.out.print(x[i]+" ");
        }
    }

    static int revElements(int n) {
        int rev = 0;
        do {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        } while (n != 0);
        return rev;
    }

    int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
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
