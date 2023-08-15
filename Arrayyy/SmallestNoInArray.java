package Arrayyy;

import java.util.Scanner;

public class SmallestNoInArray {
    public static void main(String[] args) {
        SmallestNoInArray ar = new SmallestNoInArray();
        int[] x = ar.readArray();

        int small = ar.getSmallest(x);
        System.out.println("Smalles value is : " + small);
    }

    int getSmallest(int[] ar) {
        int small = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < small)
                small = ar[i];
        }
        return small;
    }

    int[] readArray() {
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
}
