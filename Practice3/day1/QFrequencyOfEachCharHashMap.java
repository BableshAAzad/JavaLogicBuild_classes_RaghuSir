package Practice3.day1;

import java.util.*;

public class QFrequencyOfEachCharHashMap {
    public static void main(String[] args) {
        String sent = "java is a programming language";
        String[] ch = sent.split("");
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for (int i = 0; i < ch.length; i++) {
            Integer r = hm.get(ch[i]);
            if (hm.get(ch[i]) != null) {
                hm.put(ch[i], r+1);
            } else {
                hm.put(ch[i], 1);
            }
        }
        System.out.println(hm);
    }
}
