package Arrayyy.practice;

import java.util.Arrays;

public class DublicateNumbersInArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 12, 18, 14, 17, 14, 18, 19, 15, 20, 17 }; // [14, 17, 18, 20]
        int[] res = dublicates(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] dublicates(int[] arr) {
        boolean[] bl = new boolean[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (bl[i] == false) {
                    if (arr[i] == arr[j]) {
                        count++;
                        bl[i] = true;
                    }
                }
            }
            // System.out.println(Arrays.toString(bl));
        }
        // System.out.println(count);
        int[] res = new int[count];
        int temp = 0;
        for (int i = 0; i < bl.length; i++) {
            if (bl[i]) {
                res[temp++] = arr[i];
            }
        }
        return res;
    }
}
