package Practice2.Day3;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] ar1 = { 3, 2, 3 };
        int[] ar2 = { 2, 2, 1, 1, 1, 2, 2 };
        int[] sorted = arSort(ar1);
        System.out.println(Arrays.toString(sorted));
        int count = majorityCount(sorted);
        System.out.println("Majority of number is : " + count);
    }

    static int majorityCount(int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j < ar.length; j++) {
                if (ar[i] == ar[j] && ar[i] == ar[i + 1]) {
                    count++;
                }

            }
        }
        return count;
    }

    private static int[] arSort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    int temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }
        return ar;
    }

    public static void countOfFreq(int[] ar){
        boolean[] bl = new boolean[ar.length];
        // for(int i =0; i //
    }
}
