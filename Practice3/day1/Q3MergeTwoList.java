package Practice3.day1;

import java.util.*;

public class Q3MergeTwoList {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Bablesh", "Kumar", "AAzad");
        List<String> list2 = Arrays.asList("Reactjs", "Java", "SQL");
        List<String> res = new ArrayList<>(list1);
        res.addAll(list2);
        System.out.println(res);
    }
}
