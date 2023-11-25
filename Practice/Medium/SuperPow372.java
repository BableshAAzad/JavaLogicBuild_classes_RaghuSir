package Practice.Medium;

public class SuperPow372 {
    public static int superPow(int a, int[] b) {
        String s = "";
        for (int i : b) {
            s = s + i;
        }
        double d = Double.parseDouble(s);
        double r = Math.pow(a, d);
        return (int) r;
    }

    public static void main(String[] args) {
        // int a = 2;
        // int[] arr = { 1, 0 };
        int a = 2147483647; // 1198
        int[] arr = { 2, 0, 0 };
        int res = superPow(a, arr);
        System.out.println(res);
        // System.out.println(Math.pow(2, 10));
    }
}
/**
 * Your task is to calculate ab mod 1337 where a is a positive integer and b is
 * an extremely large positive integer given in the form of an array.
 * 
 * Example 1:
 * 
 * Input: a = 2, b = [3]
 * Output: 8
 * Example 2:
 * 
 * Input: a = 2, b = [1,0]
 * Output: 1024
 * Example 3:
 * 
 * Input: a = 1, b = [4,3,3,8,5,2]
 * Output: 1
 */