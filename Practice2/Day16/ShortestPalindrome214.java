package Practice2.Day16;

public class ShortestPalindrome214 {
    // public static String shortestPalindrome(String s) {
    // if (s.length() == 0)
    // return "";
    // int x = 1;
    // String res = "";
    // for (int i = 0; i < s.length(); i++) {
    // res = s.charAt(i) + res;
    // }
    // while (x < s.length()) {
    // boolean bl = rev(res);
    // if (bl)
    // return res;
    // else {
    // res = res + s.charAt(x);
    // x++;
    // }
    // }
    // return res;
    // }

    // public static boolean rev(String s) {
    // String res = "";
    // for (int i = 0; i < s.length(); i++) {
    // res = s.charAt(i) + res;
    // }
    // return res.equals(s);
    // }
    public String shortestPalindrome(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (isPalindrome(s, 0, i)) {
                String temp = s.substring(i + 1);
                String res = new StringBuilder(temp).reverse().append(s).toString();
                return res;
            }
        }
        String res = new StringBuilder(s).reverse().append(s).toString();
        return res;
    }

    boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        // String s = "aacecaaa"; // aaacecaaa
        // String s = "abcd"; // dcbabcd
        String s = "abbacd"; // dcabbacd
        ShortestPalindrome214 z = new ShortestPalindrome214();
        String res = z.shortestPalindrome(s);
        System.out.println(res);
    }
}
/**
 * You are given a string s. You can convert s to a
 * palindrome
 * by adding characters in front of it.
 * 
 * Return the shortest palindrome you can find by performing this
 * transformation.
 * 
 * Example 1:
 * 
 * Input: s = "aacecaaa"
 * Output: "aaacecaaa"
 * Example 2:
 * 
 * Input: s = "abcd"
 * Output: "dcbabcd"
 */