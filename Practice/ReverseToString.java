package Practice;

public class ReverseToString {
    public static String restoreString(String s, int[] ar) {
        char[] temp = new char[ar.length];
        char[] ch = s.toCharArray();
        for (int i = 0; i < ar.length; i++) {
            temp[ar[i]] = ch[i];
        }
        String ns = new String(temp);
        return ns;
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] ar = { 4, 5, 6, 7, 0, 2, 1, 3 };
        String res = restoreString(s, ar);
        System.out.println(res);
    }
}
