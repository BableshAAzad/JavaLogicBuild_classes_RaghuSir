package Practice.EasyLevel;

public class FindFirstPalindromicStringinthe2108 {
    public static String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();
            if (words[i].equals(sb.toString()))
                return words[i];
        }
        return "";
    }

    public static void main(String[] args) {
        // String[] words = { "abc", "car", "ada", "racecar", "cool" }; // ada
        // String[] words = { "notapalindrome","racecar" }; //racecar
        String[] words = { "def","ghi"}; // ""
        String res = firstPalindrome(words);
        System.out.println(res);
    }
}
/**
 * Given an array of strings words, return the first palindromic string in the
 * array. If there is no such string, return an empty string "".
 * 
 * A string is palindromic if it reads the same forward and backward.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: words = ["abc","car","ada","racecar","cool"]
 * Output: "ada"
 * Explanation: The first string that is palindromic is "ada".
 * Note that "racecar" is also palindromic, but it is not the first.
 * Example 2:
 * 
 * Input: words = ["notapalindrome","racecar"]
 * Output: "racecar"
 * Explanation: The first and only string that is palindromic is "racecar".
 * Example 3:
 * 
 * Input: words = ["def","ghi"]
 * Output: ""
 * Explanation: There are no palindromic strings, so the empty string is
 * returned.
 */