package Practice.Medium;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        int count = 0, temp = 0;
        char[] c = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            if (-1 != s.indexOf(ch[i]))
                if (count < temp)
                    count = temp;
            temp = 0;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}
/**
 * Given a string s, find the length of the longest
 * substring
 * without repeating characters.
 * 
 * Example 1:
 * 
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * 
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * 
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a
 * substring.
 */
