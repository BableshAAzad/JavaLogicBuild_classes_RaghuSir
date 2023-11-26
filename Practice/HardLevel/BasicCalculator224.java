package Practice.HardLevel;

import java.util.Stack;

public class BasicCalculator224 {
    public static int calculate(String s) {
        Stack<Double> stk = new Stack<Double>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isAlphabetic(i)){
                // stk.push(ch);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "1 + 1";
        int res = calculate(s);
        System.out.println(res);
    }
}
/**
 * Given a string s representing a valid expression, implement a basic
 * calculator to evaluate it, and return the result of the evaluation.
 * 
 * Note: You are not allowed to use any built-in function which evaluates
 * strings as mathematical expressions, such as eval().
 * 
 * Example 1:
 * 
 * Input: s = "1 + 1"
 * Output: 2
 * Example 2:
 * 
 * Input: s = " 2-1 + 2 "
 * Output: 3
 * Example 3:
 * 
 * Input: s = "(1+(4+5+2)-3)+(6+8)"
 * Output: 23
 */