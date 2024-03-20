package Practice.HardLevel;

public class IntegertoEnglishWords273 {
    public static String numberToWords(int num) {
        String temp = "";
        temp += nw(num / 1000000000, "Billion");
        temp += nw(num / 1000000 % 100, "Million");
        temp += nw(num / 1000 % 100, "Thousand");
        temp += nw(num / 100 % 10, "Hundred");
        temp += nw(num % 100, "");
        return temp.trim();
    }

    public static String nw(int x, String st) {
        String temp = "";
        String[] fs = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        String[] ts = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        if (x < 20)
            temp += fs[x] +" ";
        else
            temp += ts[x / 10]+" " + fs[x % 10] +" ";
        if (x != 0)
            temp += st + " ";
        return temp;
    }

    public static void main(String[] args) {
        String res = numberToWords(1234567);
        System.out.println(res);
    }
}
/**
 * Convert a non-negative integer num to its English words representation.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: num = 123
 * Output: "One Hundred Twenty Three"
 * Example 2:
 * 
 * Input: num = 12345
 * Output: "Twelve Thousand Three Hundred Forty Five"
 * Example 3:
 * 
 * Input: num = 1234567
 * Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty
 * Seven"
 */