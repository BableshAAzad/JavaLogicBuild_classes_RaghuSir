package Practice2.Day11;

public class AddBinary67 {
    public static String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        StringBuilder ans = new StringBuilder();
        int sum = 0, carry = 0;

        while (i >= 0 || j >= 0) {
            sum = carry;
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            ans.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0)
            ans.append(carry);

        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String res = addBinary(a, b);
        System.out.println(res);
    }
}
/*
 * Example 1:
 * 
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 * Example 2:
 * 
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
