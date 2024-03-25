package Practice3.day1;

import java.util.*;

public class QFrequencyOfEachWord {
    public static void main(String[] args) {
        String sent = "java is a programming language";
        String[] temp = sent.split(" ");
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        for (int i = 0; i < temp.length; i++) {
            hm.put(temp[i].length(), temp[i]);
        }
        System.out.println(hm);
    }
}
