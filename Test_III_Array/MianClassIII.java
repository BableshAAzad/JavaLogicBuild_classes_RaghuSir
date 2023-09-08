package Test_III_Array;

import java.util.Scanner;

public class MianClassIII {
    static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the " + n + " values : ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    static void display(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}
