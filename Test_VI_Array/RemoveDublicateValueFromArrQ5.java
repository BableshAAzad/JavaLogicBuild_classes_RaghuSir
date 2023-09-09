package Test_VI_Array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDublicateValueFromArrQ5 {
    public static void main(String[] args) {
        int[] ar = readArrayy();
        System.out.println("Before Removing dublicate values : ");
        System.out.println(Arrays.toString(ar));
        int[] br = removeDublicat(ar);
        System.out.println("After removing dublicats values : ");
        System.out.println(Arrays.toString(br));
    }

    static int[] removeDublicat(int[] ar) {
        boolean[] bl = new boolean[ar.length];
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (bl[i] == false) {
                for (int j = i + 1; j < ar.length; j++) {
                    if (ar[i] == ar[j]) {
                        bl[i] = true;
                        count++;
                    }
                }
            }
        }
        int[] br = new int[ar.length-count];
        int x = 0;
        for (int i = 0; i < ar.length; i++) {
            if (bl[i] == false) {
                br[x] = ar[i];
                x++;
            }
        }
        return br;
    }

    public static int[] readArrayy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        // sc.close();
        return ar;
    }
}
