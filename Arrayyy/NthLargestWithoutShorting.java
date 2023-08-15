package Arrayyy;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargestWithoutShorting {

    public static void main(String[] args) {

        NthLargestWithoutShorting ao = new NthLargestWithoutShorting();
        System.out.println("Enter the size of array : ");
        int[] x = ao.readArraysy();
        int n = 2;
        ao.descOrderShort(x);
        System.out.println(Arrays.toString(x));
        int lg = ao.nthLagest(x, n);
        System.out.println(n + " th largest in this array is : " + lg);
    }

    int[] readArraysy() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    int nthLagest(int[] ar, int n) {
        for (int i = 0; i < ar.length; i++) {
            int count = 0;
            for (int j = 0; j < ar.length; j++) {
                if (ar[j] > ar[i])
                    count++;
            }
            if (count == n - 1)
                return ar[i];
        }
        return 0;
    }

    void descOrderShort(int[] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (x[i] > x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }

}
