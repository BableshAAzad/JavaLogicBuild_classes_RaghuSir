package Test_III_Array;

import java.util.Scanner;

public class CountOfFrequencyQ6 {
    public static void main(String[] args) {
        int[] ar = readArray();
        System.out.println("Frequency of each elements is : ");
        countFrequeny(ar);
    }

    static void countFrequeny(int[] ar) {
        boolean[] bl = new boolean[ar.length];
        for (int i = 0; i < ar.length; i++) {
            if (bl[i] == false) {
                int count = 1;
                for (int j = i + 1; j < ar.length; j++) {
                    if (ar[i] == ar[j]) {
                        count++;
                        bl[i] = true;
                    }
                }
                System.out.println(ar[i] + " --> " + count);
            }
        }
    }

    static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        sc.close();
        return ar;
    }
}
