package Test_III_Array;

import java.util.Scanner;

public class IntegerNumbersPrintInArrQ8 {
    public static void main(String[] args) {
        int[] ar = readArray();
        System.out.println("Here integer nmbers is : ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
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
