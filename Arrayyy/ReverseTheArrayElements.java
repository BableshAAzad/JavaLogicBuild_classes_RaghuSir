package Arrayyy;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheArrayElements {
    public static void main(String[] args) {
        ReverseTheArrayElements ra = new ReverseTheArrayElements();
        int[] x = ra.readArray();
        System.out.println("Reverse of array is : ");
        // int[] rev = ra.reverseElements(x);
        // System.out.println(Arrays.toString(rev));
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

    // int[] reverseElements(int[] n) {
    //     String rs = "";
    //     for (int i = 0; i < n.length; i++) {
    //         int f = i;
    //         while (i < n.length) {
    //             i++;
    //         }
    //         int l = i - 1;
    //         while (l >= f) {
    //             rs = rs + n[i];
    //             l--;
    //         }
    //         if (i < n.length)
    //             rs = rs + n[i];
    //     }
        
    // }

}
