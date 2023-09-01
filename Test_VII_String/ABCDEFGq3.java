package Test_VII_String;

public class ABCDEFGq3 {
    // i/p: ABCDEFG o/p: HGFEDCB
    public static void main(String[] args) {
        String str = "ABCDEFG";
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rev = (char)(ch+1)+ rev;
        }
        System.out.println(rev);
    }
}
