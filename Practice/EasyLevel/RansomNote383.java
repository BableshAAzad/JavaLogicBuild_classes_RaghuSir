package Practice.EasyLevel;

import java.util.Arrays;

public class RansomNote383 {
    public static boolean canConstruct(String fir, String sec) {
        if (fir.length() > sec.length())
            return false;
        int count = 0, i = 0, j = 0;
        char[] ch1 = fir.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = sec.toCharArray();
        Arrays.sort(ch2);
        while (i < ch1.length && j < ch2.length) {
            if (ch1[i] == ch2[j]) {
                count++;
                i++;
            }
            j++;
        }
        if (count == ch1.length)
            return true;
        return false;
    }

    public static void main(String[] args) {
        // String ransomNote = "bg";
        // String magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"; // true

        // String ransomNote = "aab";
        // String magazine = "baa"; // true

        // String ransomNote = "a";
        // String magazine = "b"; // false

        // String ransomNote = "aa";
        // String magazine = "ab"; // false

        String ransomNote = "aa";
        String magazine = "aab"; // true
        boolean bl = canConstruct(ransomNote, magazine);
        System.out.println(bl);
    }
}
/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be
 * constructed by using the letters from magazine and false otherwise.
 * 
 * Each letter in magazine can only be used once in ransomNote.
 * 
 * Example 1:
 * 
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 * 
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 * 
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */