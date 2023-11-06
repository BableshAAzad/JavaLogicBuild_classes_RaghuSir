package Practice2.Day4;

public class Question1 {
    public static void main(String[] args) {
        String str = " -42";
        char[] ch = str.toCharArray();
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] != ' ' && ch[i] >= '0' && ch[i] <= '9' || ch[i] == '-' || ch[i] == '+') {
                temp = temp + ch[i];
            }
        }
        System.out.println(temp);
        int j = Integer.parseInt(temp);
        if (j <= 231 && j >= -231)
            System.out.println("Output is : " + j);
    }
}
