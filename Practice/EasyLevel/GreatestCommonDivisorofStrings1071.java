package Practice.EasyLevel;

public class GreatestCommonDivisorofStrings1071 {
    public static String gcdOfStrings(String str1, String str2) {
        int res = (str1.length() < str2.length() - 1 ? str1.length() - 1 : str2.length() - 1);
        int count = 0;
        System.out.println(res);
        while (res > 0) {
            if (str1.charAt(res) == str2.charAt(res)) {
                count++;
                res--;
            } else
                break;
            count = Math.max(count, res);
        }
        return str1.substring(0, count + 1);
    }

    public static void main(String[] args) {
        // String str1 = "ABCABC", str2 = "ABC"; // "ABC"
        String str1 = "ABABAB", str2 = "ABAB"; // "AB"
        String res = gcdOfStrings(str1, str2);
        System.out.println(res);
    }
}
/**
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t
 * (i.e., t is concatenated with itself one or more times).
 * 
 * Given two strings str1 and str2, return the largest string x such that x
 * divides both str1 and str2.
 * 
 * Example 1:
 * 
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * Example 2:
 * 
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * Example 3:
 * 
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 */