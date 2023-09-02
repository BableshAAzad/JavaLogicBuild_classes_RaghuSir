package Arrayyy.CombineOfTwoArrays;

import java.util.Scanner;

public class CombineTwoArrays {
    public static void main(String[] args) {
        CombineTwoArrays oc = new CombineTwoArrays();
        System.out.println("Enter the length of array 1 : ");
        int[] x = oc.readArray();
        System.out.println("Enter the length of array 2 : ");
        int[] y = oc.readArray();
        System.out.println("After combination both array : ");
        int[] z = combineTow(x, y);
        oc.display(z);
    }

    static int[] combineTow(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        return c;
    }

    public int[] readArray() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        // sc.close();
        return ar;
    }

    void display(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}
