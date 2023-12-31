package Practice.EasyLevel;

import java.util.Arrays;

public class RedistributeCharacterstoMakeAllStringsEqual1897 {
    public static boolean makeEqual(String[] words) {
        if (words.length == 1) {
            return true;
        }
        int tltChar = 0;
        for (String s : words) {
            tltChar += s.length();
        }
        if (tltChar % words.length != 0) {
            return false;
        }
        int[] myMap = new int[26];
        for (String s : words) {
            for (char c : s.toCharArray()) {
                myMap[c - 'a']++;
                System.out.println(Arrays.toString(myMap));
            }
        }
        for (int i : myMap) {
            if (i % words.length != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = { "abc", "aabc", "bc" };
        boolean res = makeEqual(words);
        System.out.println(res);
    }
}
/**
 * You are given an array of strings words (0-indexed).
 * 
 * In one operation, pick two distinct indices i and j, where words[i] is a
 * non-empty string, and move any character from words[i] to any position in
 * words[j].
 * 
 * Return true if you can make every string in words equal using any number of
 * operations, and false otherwise.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: words = ["abc","aabc","bc"]
 * Output: true
 * Explanation: Move the first 'a' in words[1] to the front of words[2],
 * to make words[1] = "abc" and words[2] = "abc".
 * All the strings are now equal to "abc", so return true.
 * Example 2:
 * 
 * Input: words = ["ab","a"]
 * Output: false
 * Explanation: It is impossible to make all the strings equal using the
 * operation.
 */