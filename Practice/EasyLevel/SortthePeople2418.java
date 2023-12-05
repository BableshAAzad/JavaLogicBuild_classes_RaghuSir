package Practice.EasyLevel;

import java.util.*;

public class SortthePeople2418 {
    public static String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        for (int i = 0; i < heights.length; i++) {
            tm.put(heights[i], names[i]);
        }
        String[] res = new String[tm.size()];
        int i = tm.size() - 1;
        Set<Integer> t = tm.keySet();
        for (Integer name : t)
            res[i--] = tm.get(name);
        return res;
    }

    public static void main(String[] args) {
        String[] names = { "Mary", "John", "Emma" };
        int[] heights = { 180, 165, 170 };
        String[] res = sortPeople(names, heights);
        System.out.println(Arrays.toString(res));
    }
}
/**
 * You are given an array of strings names, and an array heights that consists
 * of distinct positive integers. Both arrays are of length n.
 * 
 * For each index i, names[i] and heights[i] denote the name and height of the
 * ith person.
 * 
 * Return names sorted in descending order by the people's heights.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: names = ["Mary","John","Emma"], heights = [180,165,170]
 * Output: ["Mary","Emma","John"]
 * Explanation: Mary is the tallest, followed by Emma and John.
 * Example 2:
 * 
 * Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
 * Output: ["Bob","Alice","Bob"]
 * Explanation: The first Bob is the tallest, followed by Alice and the second
 * Bob.
 */