package Practice.EasyLevel;

public class FirstUniqueCharacterinaString387 {
    public static int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
        boolean[] bl = new boolean[s.length()];
        for (int i = 0; i < bl.length; i++) {
            if (bl[i] == false) {
                for (int j = i + 1; j < bl.length; j++) {
                    if (ch[i] == ch[j]) {
                        bl[i] = true;
                        bl[j] = true;
                    }
                }
            }
        }
        for (int i = 0; i < bl.length; i++) {
            if (bl[i] == false) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // String s = "leetcode"; //0
        // String s = "loveleetcode"; // 2
        // String s = "aabb"; // -1
        String s = "a"; //0
        int res = firstUniqChar(s);
        System.out.println(res);
    }
}
/**
 * Given a string s, find the first non-repeating character in it and return its
 * index. If it does not exist, return -1.
 * 
 * Example 1:
 * 
 * Input: s = "leetcode"
 * Output: 0
 * Example 2:
 * 
 * Input: s = "loveleetcode"
 * Output: 2
 * Example 3:
 * 
 * Input: s = "aabb"
 * Output: -1
 */