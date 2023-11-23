package Practice2.Day16;

import java.util.Arrays;

public class checkAnnagaram {
    public static void main(String[] args) {
        String a="abc";
        String b="cba";
        char ch[]=a.toCharArray();
        char c[]=b.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(c);
        
        System.out.println(Arrays.equals(ch,c));

        
    }
    
}
