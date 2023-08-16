package Arrayyy;

import java.util.Scanner;

public class CommonValuesBetween2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CommonValuesBetween2Arrays iar = new CommonValuesBetween2Arrays();
        System.out.println("Enter the length of 1st array : ");
        int[] m = iar.readArray();
        System.out.println("Enter the length of 2nd array :");
        int[] n = iar.readArray();

        int[] cm = iar.commElemnt(m, n);
        System.out.println("After compairing common elements are : ");
        iar.display(cm);
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

    int[] commElemnt(int[] a, int[] b) {
        int[] z = new int[a.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    z[k] = a[i];
                    k++;
                    break;
                }
            }
        }
        int[] c = new int[k];
        for (int i = 0; i < k; i++) {
            c[i] = z[i];
        }
        return c;
    }
}
