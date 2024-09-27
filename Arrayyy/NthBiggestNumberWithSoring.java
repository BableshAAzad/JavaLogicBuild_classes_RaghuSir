package Arrayyy;

import java.util.Arrays;

public class NthBiggestNumberWithSoring {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 1, 6, 3, 4 };
        int res = findNthLargest(arr, 3);
        System.out.println(res);
    }

    static int findNthLargest(int[] arr, int in) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr[arr.length - in];
    }
}
