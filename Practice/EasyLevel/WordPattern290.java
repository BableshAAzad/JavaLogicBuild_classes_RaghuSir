package Practice.EasyLevel;

import java.util.*;

public class WordPattern290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        Map<Character, String> charWord = new HashMap<>();
        Map<String, Character> wordChar = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (!charWord.containsKey(c))
                charWord.put(c, word);
            if (!wordChar.containsKey(word))
                wordChar.put(word, c);
            // System.out.println(wordChar);
            // System.out.println(charWord);
            if (!charWord.get(c).equals(word) || !wordChar.get(word).equals(c))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // String pattern = "abba", s = "dog cat cat dog"; //^ true
        // String pattern = "abba", s = "dog cat cat fish"; // ^ fasle
        String pattern = "aaaa", s = "dog cat cat dog"; // ^ fasle
        boolean bl = wordPattern(pattern, s);
        System.out.println(bl);
    }
}
/**
 * Given a pattern and a string s, find if s follows the same pattern.
 * 
 * Here follow means a full match, such that there is a bijection between a
 * letter in pattern and a non-empty word in s.
 * 
 * Example 1:
 * 
 * Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true
 * Example 2:
 * 
 * Input: pattern = "abba", s = "dog cat cat fish"
 * Output: false
 * Example 3:
 * 
 * Input: pattern = "aaaa", s = "dog cat cat dog"
 * Output: false
 */