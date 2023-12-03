package Practice.EasyLevel;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers728 {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> al = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            boolean bl = checkNum(i);
            if (bl)
                al.add(i);
        }
        return al;
    }

    public static boolean checkNum(int n) {
        int temp = n, count = 0;
        do {
            int d = n % 10;
            if (d !=0 && temp % d == 0)
                count++;
            n = n / 10;
        } while (n != 0);
        return ("" + temp).length() == count;
    }

    public static void main(String[] args) {
        int left = 1, right = 22; // [1,2,3,4,5,6,7,8,9,11,12,15,22]
        // int left = 47, right = 85; // [48,55,66,77]
        List<Integer> l = selfDividingNumbers(left, right);
        System.out.println(l);
    }
}
/**
 * A self-dividing number is a number that is divisible by every digit it
 * contains.
 * 
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 ==
 * 0, and 128 % 8 == 0.
 * A self-dividing number is not allowed to contain the digit zero.
 * 
 * Given two integers left and right, return a list of all the self-dividing
 * numbers in the range [left, right].
 * 
 * Example 1:
 * 
 * Input: left = 1, right = 22
 * Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
 * Example 2:
 * 
 * Input: left = 47, right = 85
 * Output: [48,55,66,77]
 * 
 */