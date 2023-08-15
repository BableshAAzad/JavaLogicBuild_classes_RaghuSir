package Arrayyy;

import java.util.Scanner;

public class HowMenyTimesPresentValue {
    public static void main(String[] args) {
        HowMenyTimesPresentValue hmt = new HowMenyTimesPresentValue();
        int[] x = hmt.readArray();
        hmt.countRepitedValue(x);
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

    void countRepitedValue(int[] ar){
        boolean[] rs = new boolean[ar.length];
        for(int i=0; i<ar.length; i++){
            if(rs[i]==false){
                int count = 1;
                for(int j=i+1; j<ar.length; j++){
                    if(ar[i]==ar[j]){
                        count++;
                        rs[j]=true;
                    }
                }
                System.out.println(ar[i]+" --> "+count);
            }
        }
    }
}
