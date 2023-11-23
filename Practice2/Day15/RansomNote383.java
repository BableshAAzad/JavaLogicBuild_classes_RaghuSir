package Practice2.Day15;

public class RansomNote383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        
        return false;
    }

    public static void main(String[] args) {
        // String ransomNote = "a";
        // String magazine = "b"; // false
        // String ransomNote = "aa";
        // String magazine = "aab"; // true
        String ransomNote = "aab";
        String magazine = "baa"; // true
        // String ransomNote = "bg";
        // String magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"; //
        // true
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
 * 
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