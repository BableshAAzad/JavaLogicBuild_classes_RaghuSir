package Practice2.Day4;

public class Question6SubArray {
    public static void main(String[] args) {
        /**
         * Length of small Word except space character.
         * i/p: luffy is still joyboy.
         * o/p:is
         */
        String str = "luffy is still joyboy";
        char[] ch = str.toCharArray();
        String s = "";
        String temp ="";
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == ' ' && ch[i + 1] != ' '  &&  ch[i-1]==' ') {
                s = s + ch[i+1];
            }
            if(s.length() !=0){
                temp = s;
            }
            if(temp.length()>s.length()){
                temp = s;
            }
        }
        System.out.println(temp);
    }
}
