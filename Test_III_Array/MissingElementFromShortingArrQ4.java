package Test_III_Array;

import java.util.Scanner;

public class MissingElementFromShortingArrQ4 {
    public static void main(String[] args) {
        int[] x = readArray();
        System.out.println("Here Missing elements is : ");
        missingElements(x);
    }

    static void missingElements(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            int f = ar[i] + 1;
            int l = ar[i + 1];
            while (f < l) {
                System.out.print(f + " ");
                f++;
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
