package Practice.EasyLevel;

public class BaseSeven504 {
    public static String convertToBase7(int num) {
        int base = 1;
        int ans = 0;
        while (num != 0) {
            int rem = num % 7;
            ans = ans + base * rem;
            base = base * 10;
            num = num / 7;
        }
        return Integer.toString(ans);
    }

    public static void main(String[] args) {
        // int a = 100; // "202"
        int a = -7; // "-10"
        // int a = -8; // "-11"
        String res = convertToBase7(a);
        System.out.println(res);
    }
}
/**
 * Given an integer num, return a string of its base 7 representation.
 * 
 * Example 1:
 * 
 * Input: num = 100
 * Output: "202"
 * Example 2:
 * 
 * Input: num = -7
 * Output: "-10"
 */