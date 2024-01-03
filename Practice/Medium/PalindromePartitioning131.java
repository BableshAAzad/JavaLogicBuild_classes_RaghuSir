package Practice.Medium;

import java.util.*;

public class PalindromePartitioning131 {
    public static List<List<String>> partition(String s) {
        List<List<String>> temp = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            List<String> t = new LinkedList<>();
            for (int j = 0; j < s.length(); j++) {
                t.add(s.charAt(j) + "");
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> res = partition(s);
        System.out.println(res);
    }
}

/**
 * Given a string s, partition s such that every
 * substring
 * of the partition is a
 * palindrome
 * . Return all possible palindrome partitioning of s.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "aab"
 * Output: [["a","a","b"],["aa","b"]]
 * Example 2:
 * 
 * Input: s = "a"
 * Output: [["a"]]
 */