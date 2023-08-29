package Test_IV_String;

public class A2Z1A1D1Q4Method2 {
    public static void main(String[] args) {
        String str = "AAABBCDAABBB";
        String res = isStringFreq(str);
        System.out.println("Result output is : " + res);
    }

    static String isStringFreq(String str) {
        char[] ch = str.toCharArray();
        int count = 1;
        String res = "";
        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1] != ch[i]) {
                res = res + ch[i - 1];
                res = res + count;
                count = 1;
            } else
                count++;
        }
        res = res + ch[ch.length - 1];
        res = res + count;
        return res;
    }
}
