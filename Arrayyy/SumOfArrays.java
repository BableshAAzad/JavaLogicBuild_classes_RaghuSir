package Arrayyy;

import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        SumOfArrays sa = new SumOfArrays();
        int[] x = sa.readArray();

        int sum = sa.getSum(x);
        System.out.println("Sum of array is : " + sum);
    }

    int getSum(int[] ar) {
        int sum = 0;
        for (int i = 0; i <= ar.length - 1; i++) {
            sum = sum + ar[i];
        }
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
