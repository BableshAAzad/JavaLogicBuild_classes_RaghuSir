package Practice2.Day11;

public class IndexOfTheFirstOccurence28 {
    public static int strStr(String haystack, String needle) {
        if (haystack.length() == 1 && needle.length() == 1)
            return 0;
        // boolean bl = haystack.contains(needle);
        // if (bl) {
        // String[] s = haystack.split(needle);
        // int a = s[0].length();
        // if (a == 0)
        // return 0;
        // else
        // return a;
        // } else
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        // String haystack = "sadbutsad";
        // String needle = "sad"; // 0
        // String haystack = "leetcode";
        // String needle = "leeto"; // -1
        // String haystack = "hello";
        // String needle = "ll"; // 2
        // String haystack = "mississippi";
        // String needle = "issip"; // 4
        String haystack = "aaa";
        String needle = "a"; // 0
        int res = strStr(haystack, needle);
        System.out.println(res);
    }
}
/*
 * Example 1:
 * 
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * 
 * Example 2:
 * 
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
