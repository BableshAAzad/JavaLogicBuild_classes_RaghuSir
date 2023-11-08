package Practice2.day7;

import java.util.Scanner;

public class MATaddBecome15 {
    static private int sumColRow(int[][] arr){
        
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 values : ");
        int[][] arr =new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               arr[i][j] = sc.nextInt();
            }
        }
        int sum = sumColRow(arr);
       System.out.println(sum);
    }
    
}
