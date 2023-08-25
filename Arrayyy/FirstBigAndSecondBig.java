package Arrayyy;

import java.util.Scanner;

public class FirstBigAndSecondBig {
    public static void main(String[] args) {
        System.out.println("Enter the size of array : ");
        int[] x = readArr();
        fandsBig(x);
    }

    static void fandsBig(int[] ar) {
        int fbig = Integer.MIN_VALUE;
        int sbig = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > fbig) {
                sbig = fbig;
                fbig = ar[i];
            }
            if (ar[i] > sbig && ar[i] != fbig)
                sbig = ar[i];
        }
        System.out.println("First big is : " + fbig);
        System.out.println("Second big is : " + sbig);
    }

    static int[] readArr() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the " + n + " values : ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    static void display(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}
