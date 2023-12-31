package Practice.Medium;

public class PermutationinString567 {
    public static boolean checkInclusion(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        String temp = sb.toString();
        if (s2.contains(temp) || s2.contains(s1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // String s1 = "ab", s2 = "eidbaooo"; // true
        // String s1 = "ab", s2 = "eidboaoo"; // fasle
        String s1 = "abc", s2 = "bbbca"; // true
        boolean bl = checkInclusion(s1, s2);
        System.out.println(bl);
    }
}
/**
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1,
 * or false otherwise.
 * 
 * In other words, return true if one of s1's permutations is the substring of
 * s2.
 * 
 * Example 1:
 * 
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 * Example 2:
 * 
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 * 
 */