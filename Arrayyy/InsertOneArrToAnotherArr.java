package Arrayyy;

import java.util.Scanner;

public class InsertOneArrToAnotherArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertOneArrToAnotherArr iar = new InsertOneArrToAnotherArr();
        System.out.println("Enter the length of 1st array : ");
        int[] b = iar.readArray();
        System.out.println("Enter the length of 2nd array :");
        int[] c = iar.readArray();
        System.out.println("Enter the index value where want to add second array : ");
        int d = sc.nextInt();
        int[] m = iar.inSert(b, c, d);
        System.out.println("After cobination both arrays : ");
        iar.display(m);
    }

    int[] readArray() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " values :");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    void display(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + " ");
        }
    }

    int[] inSert(int[] x, int[] y, int in) {
        if (in < 0 || in > x.length) {
            System.out.println("Index not in the range");
            return x;
        }
        int[] z = new int[x.length + y.length];
        for (int i = 0; i < y.length; i++) {
            z[in + i] = y[i];
        }
        for (int i = 0; i < x.length; i++) {
            if (i < in)
                z[i] = x[i];
            else
                z[i + y.length] = x[i];
        }
        return z;
    }
}
