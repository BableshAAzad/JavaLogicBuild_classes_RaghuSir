package Practice3.day1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QRemoveDublicateWordsUsingRecursion {
    public static void main(String[] args) {
        String sent = "Hello hel hel boss bro h bro";
        String[] temp = sent.split(" ");
        Set<String> set = new HashSet<>();
        Set<String> res = removeDublicate(temp, temp.length-1, set);
        System.out.println(res);
    }

    static Set<String> removeDublicate(String[] temp, int num, Set<String> set ) {
        if(num <= 0){
           return set;
        }else{
            set.add(temp[num]);
        }
        return removeDublicate(temp, num - 1, set);
    }

}
