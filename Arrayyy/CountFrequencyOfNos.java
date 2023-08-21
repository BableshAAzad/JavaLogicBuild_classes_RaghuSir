package Arrayyy;

import java.util.Scanner;

public class CountFrequencyOfNos {
    public static void main(String[] args) {
        CountFrequencyOfNos ao = new CountFrequencyOfNos();
        System.out.println("Enter the size of array : ");
        int[] x = ao.readArraysr();
        ao.printFrequencyN(x);
    }

    int[] readArraysr() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    void printFrequencyN(int[] ar) {
        int big = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > big)
                big = ar[i];
        }
        int[] count = new int[big + 1];
        for (int j = 0; j < ar.length; j++) {
            count[ar[j]]++;
        }
        for (int k = 0; k < ar.length; k++) {
            if (count[ar[k]] != 0)
                System.out.println(ar[k] + " is " + count[ar[k]] + " time present in array");
            count[ar[k]] = 0;
        }
    }
}
