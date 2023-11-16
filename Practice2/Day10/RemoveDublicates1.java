package Practice2.Day10;

public class RemoveDublicates1 {
    static String remo(String s) {
        char[] ch = s.toCharArray();
        // StringBuffer sb = new StringBuffer();
        boolean[] bl = new boolean[ch.length];
        String temp = "";
        for (int i = 0; i < ch.length; i++) {
            if (bl[i] == false) {
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        bl[i] = true;
                    }
                }
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if (bl[i] == false)
                // sb.append(ch[i]);
                temp = temp + ch[i];
        }
        // return sb.toString();
        return temp;
    }

    public static void main(String[] args) {
        String s = "cbacdcb"; // ^ acdb
        String res = remo(s);
        System.out.println(res);
    }
}
