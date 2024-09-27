package Arrayyy.practice;

import java.util.Arrays;

public class SmallestNumberArray {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 7, 3, 1, 7, 3, 6 };
        int res = smallestNumber(arr);
        System.out.println("Smallest Number is : " + res);
    }

    static int smallestNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int res = arr[i];
                    arr[i] = arr[j];
                    arr[j] = res;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr[0];
    }

    // [1, 2, 3, 3, 4, 5, 6, 7, 7]
    // Smallest Number is : 1
}
