package Practice2.Day16;

import java.util.*;

public class GroupAnagrams49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l = new ArrayList<List<String>>();
        boolean[] bl = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (bl[i] == false) {
                List<String> al = new ArrayList<String>(strs.length);
                char[] ch = strs[i].toCharArray();
                Arrays.sort(ch);
                for (int j = 0; j < strs.length; j++) {
                    char[] ch1 = strs[j].toCharArray();
                    Arrays.sort(ch1);
                    if (ch.length == ch1.length) {
                        if (Arrays.equals(ch, ch1)) {
                            al.add(strs[j]);
                            bl[j] = true;
                        }
                    }
                }
                if (al.size() > 0)
                    l.add(al);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" }; // ["bat"],["nat","tan"],["ate","eat","tea"]
        List<List<String>> res = groupAnagrams(strs);
        System.out.println(res);
    }
}
/**
 * Given an array of strings strs, group the anagrams together. You can return
 * the answer in any order.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 * 
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 * 
 * Input: strs = ["a"]
 * Output: [["a"]]
 */