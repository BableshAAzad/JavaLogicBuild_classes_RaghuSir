package Stringgg;

public class CountCharEachWords {
    public static void main(String[] args) {
        String str = " Bab   ku a sjh ";
        char[] ch = str.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ')
                count++;
            else {
                if (count != 0)
                    System.out.print(count + " ");
                count = 0;
            }
        }
        if (count != 0)
            System.out.print(count);
    }
}
