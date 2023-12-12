package Practice.EasyLevel;

import java.util.*;

public class FindWordsContainingCharacter2942 {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(x + ""))
                al.add(i);
        }
        return al;
    }

    public static void main(String[] args) {
        String[] words = { "abc", "bcd", "aaaa", "cbc" };
        char x = 'a';
        List<Integer> res = findWordsContaining(words, x);
        System.out.println(res);
    }
}
/**
 * You are given a 0-ied array of strings words and a character x.
 * 
 * Return an array of indices representing the words that contain the character
 * x.
 * 
 * Note that the returned array may be in any order.
 * F
 * Example 1:
 * 
 * Input: words = ["leet","code"], x = "e"
 * Output: [0,1]
 * Explanation: "e" occurs in both words: "leet", and "code". Hence, we return
 * indices 0 and 1.
 * Example 2:
 * 
 * Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
 * Output: [0,2]
 * Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and
 * 2.
 * Example 3:
 * 
 * Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
 * Output: []
 * Explanation: "z" does not occur in any of the words. Hence, we return an
 * empty array.
 */