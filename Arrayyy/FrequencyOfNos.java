package Arrayyy;

import java.util.Scanner;

public class FrequencyOfNos {
    public static void main(String[] args) {

        FrequencyOfNos ao = new FrequencyOfNos();
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
        for (int i = 0; i < ar.length; i++) {
            count[ar[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[ar[i]] != 0)
                System.out.println(ar[i] + " is " + count[ar[i]] + " time present in array");
            count[ar[i]] = 0;
        }
    }
}
