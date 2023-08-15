package Arrayyy;

import java.util.Scanner;

public class CountUserEnterElementHowMenyTimesPresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountUserEnterElementHowMenyTimesPresent ce = new CountUserEnterElementHowMenyTimesPresent();
        int[] x = ce.readArray();
        System.out.println("Enter the value and check how many times present : ");
        int ele = sc.nextInt();
        int c = ce.countElem(x, ele);
        System.out.println("Index "+ele+" value is present "+c+" times");   
    }

    int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    int countElem(int[] ar, int ele){
        int count = 0;
        for(int i=0; i<ar.length; i++){
            if(ar[i]==ele)
               count++;
        }
        return count++;
    }
}
