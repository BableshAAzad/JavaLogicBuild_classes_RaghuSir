package Practice.Medium;

public class LengthoftheLongestAlphabeticalContinuousSubstring2414 {
    public static int longestContinuousSubstring(String s) {
        int res = 0, count = 0;
        char[] ch = s.toCharArray();
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (!temp.contains(ch[i] + "")) {
                count++;
                temp += ch[i];
                res = Math.max(res, count);
                System.out.println(temp);
            } else {
                temp = "";
                count = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abacaba";
        int res = longestContinuousSubstring(s);
        System.out.println(res);
    }
}

/**
 * An alphabetical continuous string is a string consisting of consecutive
 * letters in the alphabet. In other words, it is any substring of the string
 * "abcdefghijklmnopqrstuvwxyz".
 * 
 * For example, "abc" is an alphabetical continuous string, while "acb" and "za"
 * are not.
 * Given a string s consisting of lowercase letters only, return the length of
 * the longest alphabetical continuous substring.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "abacaba"
 * Output: 2
 * Explanation: There are 4 distinct continuous substrings: "a", "b", "c" and
 * "ab".
 * "ab" is the longest continuous substring.
 * Example 2:
 * 
 * Input: s = "abcde"
 * Output: 5
 * Explanation: "abcde" is the longest continuous substring.
 */