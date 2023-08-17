package Arrayyy;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromArr {
    public static void main(String[] args) {
        RemoveDuplicatesFromArr ao = new RemoveDuplicatesFromArr();
        int[] x = ao.readArrr();
        int[] y=ao.removeDuplicates(x);
        System.out.println(Arrays.toString(y));
    }
    
    int[] readArrr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    int[] removeDuplicates(int[] ar) {
        boolean[] rs = new boolean[ar.length];
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (rs[i] == false) {
                for (int j = i + 1; j < ar.length; j++) {
                    if (ar[i] == ar[j]) {
                        rs[j] = true;
                        count++;
                    }
                }
            }
        }
        int[] br = new int[ar.length-count];
        int j = 0;
        for (int i = 0; i < ar.length; i++) {
            if (rs[i] == false)
                br[j++] = ar[i];
        }
        return br;
    }
}
