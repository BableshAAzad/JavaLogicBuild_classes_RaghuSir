package Arrayyy;

import java.util.Scanner;

public class SumOfArrayDigitsAndReplaceBySum {
    public static void main(String[] args) {
        SumOfArrayDigitsAndReplaceBySum ao = new SumOfArrayDigitsAndReplaceBySum();
        int[] x = ao.readArray();
        System.out.println("Sum of Array is : ");
        ao.updateBySum(x);
    }

    void updateBySum(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sumOfDigit(ar[i]);
            System.out.println(ar[i]);
        }
    }

    int sumOfDigit(int x) {
        int sum = 0;
        do {
            sum = sum + x % 10;
            x = x / 10;
        } while (x > 0);
        return sum;
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
