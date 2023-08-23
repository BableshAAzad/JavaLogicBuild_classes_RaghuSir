package Arrayyy;

import java.util.Scanner;

public class ReverseArrayMethod1 {

    public static void main(String[] args) {
        ReverseArrayMethod1 ra = new ReverseArrayMethod1();
        int[] x = ra.readArray();
        System.out.println("Reverse of array is : ");
        ra.reverse(x);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
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
        return ar;
    }

    void reverse(int[] ar) {
        int f = 0, l = ar.length - 1;
        while (f < l) {
            int temp = ar[f];
            ar[f] = ar[l];
            ar[l] = temp;
            f++;
            l--;
        }
    }
}
