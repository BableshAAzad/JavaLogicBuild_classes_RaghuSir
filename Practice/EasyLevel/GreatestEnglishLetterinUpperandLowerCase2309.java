package Practice.EasyLevel;

import java.util.*;

public class GreatestEnglishLetterinUpperandLowerCase2309 {
    public static String greatestLetter(String s) {
        // ^ c d e l E E O T
        Set<Character> hs = new HashSet<>();
        for (char ch : s.toCharArray())
            hs.add(ch);
        for (char ch = 'Z'; ch >= 'A'; ch--)
            if (hs.contains(ch) && hs.contains((char) ('a' + (ch - 'A'))))
                return "" + ch;
        return "";
    }

    public static void main(String[] args) {
        // String s = "lEeTcOdE";
        // String res = greatestLetter(s);
        // System.out.println(res);
        System.out.println((char) ('a' + ('E' - 'A')));
    }
}
/**
 * Given a string of English letters s, return the greatest English letter which
 * occurs as both a lowercase and uppercase letter in s. The returned letter
 * should be in uppercase. If no such letter exists, return an empty string.
 * 
 * An English letter b is greater than another letter a if b appears after a in
 * the English alphabet.
 * 
 * Example 1:
 * 
 * Input: s = "lEeTcOdE"
 * Output: "E"
 * Explanation:
 * The letter 'E' is the only letter to appear in both lower and upper case.
 * Example 2:
 * 
 * Input: s = "arRAzFif"
 * Output: "R"
 * Explanation:
 * The letter 'R' is the greatest letter to appear in both lower and upper case.
 * Note that 'A' and 'F' also appear in both lower and upper case, but 'R' is
 * greater than 'F' or 'A'.
 * Example 3:
 * 
 * Input: s = "AbCdEfGhIjK"
 * Output: ""
 * Explanation:
 * There is no letter that appears in both lower and upper case.
 */