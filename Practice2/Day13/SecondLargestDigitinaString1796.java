package Practice2.Day13;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestDigitinaString1796 {
    public static int secondHighest(String s) {
        char[] ch = s.toCharArray();
        TreeSet<Integer> tr = new TreeSet<Integer>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                tr.add(ch[i] - 48);
            }
        }
        ArrayList<Integer> al = new ArrayList<Integer>(tr);
        if (al.size() == 1)
            return -1;
        else if (al.size() == 0)
            return -1;
        return al.get(al.size() - 2);
    }

    public static void main(String[] args) {
        // String s = "dfa12321afd";
        String s = "abc1111";
        int res = secondHighest(s);
        System.out.println(res);
    }
}
/*
 * Given an alphanumeric string s, return the second largest numerical digit
 * that appears in s, or -1 if it does not exist.
 * 
 * An alphanumeric string is a string consisting of lowercase English letters
 * and digits.
 * 
 * Example 1:
 * 
 * Input: s = "dfa12321afd"
 * Output: 2
 * Explanation: The digits that appear in s are [1, 2, 3]. The second largest
 * digit is 2.
 * Example 2:
 * 
 * Input: s = "abc1111"
 * Output: -1
 * Explanation: The digits that appear in s are [1]. There is no second largest
 * digit.
 */