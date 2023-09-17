package Stringgg;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("Eneter 5 values : ");
        for(int i=0; i<5; i++){
            int a = sc.nextInt();
            al.add(i, a);
        }
        System.out.println(al);
        System.out.println(al.get(2));
    }
}
