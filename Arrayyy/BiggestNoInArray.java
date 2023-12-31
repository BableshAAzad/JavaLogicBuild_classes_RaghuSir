package Arrayyy;

import java.util.Scanner;

public class BiggestNoInArray {
    public static void main(String[] args) {
        BiggestNoInArray ao = new BiggestNoInArray();
        int[] x = ao.readArray();
        int big = ao.getBiggest(x);
        System.out.println("Beggest value is : " + big);
    }

    int getBiggest(int[] ar) {
        int big = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > big)
                big = ar[i];
        }
        return big;
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
