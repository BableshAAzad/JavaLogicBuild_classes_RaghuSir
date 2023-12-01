package Practice.EasyLevel;

import java.util.ArrayList;

public class MaximumNumberofWordsYouCanType1935 {
    public static int canBeTypedWords(String text, String brokenLetters) {
        int c = 0, ans = 0;
        for (String s : text.split(" ")) {
            ArrayList<Character> al = new ArrayList<>();
            c = 0;
            for (char ch : s.toCharArray()) {
                al.add(ch);
            }
            for (char ch : brokenLetters.toCharArray()) {
                if (al.contains(ch))
                    c++;
            }
            if (c == 0)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        // String text = "hello world";
        // String brokenLetters = "ad"; // 1
        // String text = "leet code";
        // String brokenLetters = "lt"; // 1
        // String text = "leet code";
        // String brokenLetters = "e"; // 0
        String text = "a b c d e";
        String brokenLetters = "abcde"; // 0
        int res = canBeTypedWords(text, brokenLetters);
        System.out.println(res);
    }
}
/**
 * There is a malfunctioning keyboard where some letter keys do not work. All
 * other keys on the keyboard work properly.
 * 
 * Given a string text of words separated by a single space (no leading or
 * trailing spaces) and a string brokenLetters of all distinct letter keys that
 * are broken, return the number of words in text you can fully type using this
 * keyboard.
 * 
 * Example 1:
 * 
 * Input: text = "hello world", brokenLetters = "ad"
 * Output: 1
 * Explanation: We cannot type "world" because the 'd' key is broken.
 * Example 2:
 * 
 * Input: text = "leet code", brokenLetters = "lt"
 * Output: 1
 * Explanation: We cannot type "leet" because the 'l' and 't' keys are broken.
 * Example 3:
 * 
 * Input: text = "leet code", brokenLetters = "e"
 * Output: 0
 * Explanation: We cannot type either word because the 'e' key is broken.
 */