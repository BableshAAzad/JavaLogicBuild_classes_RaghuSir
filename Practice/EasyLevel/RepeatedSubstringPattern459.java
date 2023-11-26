package Practice.EasyLevel;

public class RepeatedSubstringPattern459 {
    public static boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        String str1 = str.substring(1, str.length() - 1);
        // System.out.println(str);
        // System.out.println(str1);
        return str1.contains(s);
    }

    public static void main(String[] args) {
        // String s = "aba"; // fasle
        String s = "abab"; // true

        boolean bl = repeatedSubstringPattern(s);
        System.out.println(bl);
    }
}
/**
 * Given a string s, check if it can be constructed by taking a substring of it
 * and appending multiple copies of the substring together.
 * 
 * Example 1:
 * 
 * Input: s = "abab"
 * Output: true
 * Explanation: It is the substring "ab" twice.
 * Example 2:
 * 
 * Input: s = "aba"
 * Output: false
 * Example 3:
 * 
 * Input: s = "abcabcabcabc"
 * Output: true
 * Explanation: It is the substring "abc" four times or the substring "abcabc"
 * twice.
 * 
 */