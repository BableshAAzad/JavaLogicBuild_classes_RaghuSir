package Practice.Demo;

import java.util.Stack;

public class ValidParentheses20 {
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stk = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(')
                stk.push(ch);
            else {
                if (s.isEmpty())
                    return false;
                switch (ch) {
                    case '}':
                        if (stk.pop() != '{')
                            return false;
                        break;
                    case ']':
                        if (stk.pop() != '[')
                            return false;
                        break;
                    case ')':
                        if (stk.pop() != '(')
                            return false;
                        break;
                }
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        String s = ")(){}";
        boolean bl = isValid(s);
        System.out.println(bl);
    }
}
/*
 * Example 1:
 * Input: s = "()"
 * Output: true
 * 
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * 
 * Example 3:
 * Input: s = "(]"
 * Output: false
 */