package Practice;

import java.util.Arrays;

public class LongestCommonPrefix14 {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int x = 0;
        while (x < s1.length() && x < s2.length()) {
            if (s1.charAt(x) == s2.charAt(x))
                x++;
            else
                break;
        }
        return s1.substring(0, x);
    }

    public static void main(String[] args) {
        String[] str = { "flower", "flow", "flight" }; // fl
        // String[] str = { "dog", "racecar", "car" }; // ""
        String s = longestCommonPrefix(str);
        System.out.println(s);
    }
}
