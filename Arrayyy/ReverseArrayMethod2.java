package Arrayyy;

import java.util.Scanner;

public class ReverseArrayMethod2 {
    public static void main(String[] args) {
        int[] x = readArray();
        System.out.println("Reverse of array is : ");
        reverseMethod(x);
    }

    static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    static void reverseMethod(int[] ar) {
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i] + " ");
        }
    }
}
