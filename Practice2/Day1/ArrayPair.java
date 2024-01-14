package Practice2.Day1;

import java.util.Arrays;
import java.util.LinkedList;

public class ArrayPair {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 4, 2, 1, 3, 2, 1 };
        makePairs(arr);
    }

    static void makePairs(int[] arr) {
        Arrays.sort(arr); // ^ [1, 1, 1, 1, 2, 2, 2, 3, 3, 4]
        // System.out.println(Arrays.toString(arr));
        LinkedList<Object> ll = new LinkedList<>();
        for (int i = 1; i < arr.length; i++) {
            LinkedList<Integer> ll1 = new LinkedList<>();
            for (int j = i - 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ll1.add(arr[i]);
                } else {
                    // System.out.println("---------------");
                    break;
                }
            }
            if (ll1.size() % 2 == 0 && ll1.size() != 0) {
                // System.out.println(ll1);
                ll.add(ll1);
            }
        }
        System.out.println(ll);
    }
}
