package Arrayyy;

import java.util.Arrays;

public class NegativePositiveNoMethod2 {
    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 4, 5, -7, 6, 7, 8, 9, -1, -4 };
        int pc = 0;
        int nc = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] >= 0)
                pc++;
            else
                nc++;
        }
        System.out.println(pc);
        System.out.println(nc);
        int[] pp = new int[pc];
        int[] nn = new int[nc];
        int a = 0, b = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] <= 0) {
                nn[a] = ar[i];
                a++;
            } else {
                pp[b] = ar[i];
                b++;
            }

        }
        System.out.println("Here possitive number is : ");
        System.out.println(Arrays.toString(pp));
        System.out.println("Here negative number is : ");
        System.out.println(Arrays.toString(nn));
    }
}
