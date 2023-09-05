package Arrayyy.CombineOfTwoArrays;

import java.util.Arrays;

public class CombineTwoArrAscMyMethod {
    public static void main(String[] args) {
        int[] ar = { 4, 3, 1, 2 };
        System.out.println("first array : ");
        System.out.println(Arrays.toString(ar));

        int[] br = { 6, 5, 9, 4 };
        System.out.println("first array : ");
        System.out.println(Arrays.toString(br));

        int[] cr = new int[ar.length + br.length];
        for (int i = 0; i < ar.length; i++) {
            cr[i] = ar[i];
        }
        for (int i = 0; i < br.length; i++) {
            cr[ar.length + i] = br[i];
        }
        for (int i = 0; i < cr.length; i++) {
            for (int j = 0; j < cr.length; j++) {
                if (cr[j] > cr[i]) {
                    int temp = cr[i];
                    cr[i] = cr[j];
                    cr[j] = temp;
                }
            }
        }
        System.out.println("After sorting in Ascending order :");
        System.out.println(Arrays.toString(cr));
        // for (int i = 0; i < cr.length; i++) {
        //     System.out.print(cr[i] + " ");
        // }
    }
}
