package Test_III_Array;

import java.util.Arrays;
import java.util.Scanner;

public class CommorEleBetween2ArrQ5 {
    public static void main(String[] args) {
        System.out.println("Enter the size of first Array :");
        int[] ar = readArray();
        System.out.println("Enter the size of second Array : ");
        int[] br = readArray();
        int[] cr = commElements(ar, br);
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(br));
        System.out.println("Here common elements are : ");
        for (int i = 0; i < ar.length; i++) {
            if (cr[i] != 0)
                System.out.print(cr[i] + " ");
        }

    }

    private static int[] commElements(int[] ar, int[] br) {
        int[] cr = new int[ar.length + br.length];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < br.length; j++) {
                if (ar[i] == br[j])
                    cr[i] = ar[i];
            }
        }
        return cr;
    }

    static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values : ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }
}
