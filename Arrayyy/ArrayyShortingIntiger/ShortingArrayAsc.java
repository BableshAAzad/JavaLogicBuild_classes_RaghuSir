package Arrayyy.ArrayyShortingIntiger;

import java.util.Scanner;

public class ShortingArrayAsc {
    public static void main(String[] args) {
          int[] ar = readArray();
          int[] br = sortB(ar);
          System.out.println("After sorting array in Ascending order : ");
          display(br);
    }

    private static int[] sortB(int x[]) {
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        return x;
    }

    public static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        // sc.close();
        return ar;
    }

    public static void display(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
