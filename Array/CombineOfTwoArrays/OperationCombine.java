package Array.CombineOfTwoArrays;

import java.util.Scanner;

public class OperationCombine {
    int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the length of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the " + n + " values : ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }
    void display(int[] ar){
        for(int i = 0; i<ar.length; i++){
            System.out.println(ar[i]);
        }
    }
    
}
