package Practice.HardLevel;

public class CountSpecialIntegers2376 {
    public static int countSpecialNumbers(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            char[] ch = { (char) i };
            int x = 1;
            while (i > 0) {
                if (ch.length > 1) {
                    if (ch[x] != ch[x - 1]) {
                        count++;
                    }
                } else
                    count++;
                i--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 20;
        int res = countSpecialNumbers(n);
        System.out.println(res);
    }
}
/**
 * We call a positive integer special if all of its digits are distinct.
 * 
 * Given a positive integer n, return the number of special integers that belong
 * to the interval [1, n].
 * 
 * Example 1:
 * 
 * Input: n = 20
 * Output: 19
 * Explanation: All the integers from 1 to 20, except 11, are special. Thus,
 * there are 19 special integers.
 * Example 2:
 * 
 * Input: n = 5
 * Output: 5
 * Explanation: All the integers from 1 to 5 are special.
 * Example 3:
 * 
 * Input: n = 135
 * Output: 110
 * Explanation: There are 110 integers from 1 to 135 that are special.
 * Some of the integers that are not special are: 22, 114, and 131.
 */