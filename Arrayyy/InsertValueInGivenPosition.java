package Arrayyy;

import java.util.Arrays;
import java.util.Scanner;

public class InsertValueInGivenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertValueInGivenPosition ao = new InsertValueInGivenPosition();
        System.out.println("Enter the size of array : ");
        int[] x = ao.readArrayso();
        System.out.println("Enter the index number where want to add : ");
        int in = sc.nextInt();
        System.out.println("Enter value : ");
        int ele = sc.nextInt();
        int[] fi = ao.isertValue(x, in, ele);
        System.out.println(Arrays.toString(fi));
    }

    int[] readArrayso() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    int[] isertValue(int[] ar, int in, int ele) {
        if (in < 0 || in > ar.length) {
            System.out.println("Index is not present in the element");
            return ar;
        }
        int[] br = new int[ar.length + 1];
        for (int i = 0; i < ar.length; i++) {
            if (i < in)
                br[i] = ar[i];
            else
                br[i + 1] = ar[i];
        }
        br[in] = ele;
        return br;
    }
}
