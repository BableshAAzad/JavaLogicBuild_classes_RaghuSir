package Arrayyy.CombineOfTwoArrays;

import java.util.Scanner;

public class Arrage2ArInZigZagOrder {
    public static void main(String[] args) {
        Arrage2ArInZigZagOrder ao = new Arrage2ArInZigZagOrder();
        System.out.println("Enter the size of 1st first : ");
        int[] x = ao.readArrayy();
        System.out.println("Enter the size of 2nd array : ");
        int[] y = ao.readArrayy();
        System.out.println("User enter first array : ");
        ao.display(x);
        System.out.println("User enter second array : ");
        ao.display(y);
        int[] z = ao.zigzag(x, y);
        System.out.println("After zigzag merged : ");
        ao.display(z);
    }

    int[] readArrayy() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    void display(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + " ");
        }
    }

    int[] zigzag(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0;
        while (i < a.length && i < b.length) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            i++;
            j++;
        }
        while (i < a.length) {
            c[j] = a[i];
            j++;
            i++;
        }
        while (i < b.length) {
            c[j] = b[i];
            j++;
            i++;
        }
        return c;
    }
}
