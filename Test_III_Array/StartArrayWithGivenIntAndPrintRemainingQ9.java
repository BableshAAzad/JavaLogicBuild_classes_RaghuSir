package Test_III_Array;

import java.util.Arrays;
import java.util.Scanner;

public class StartArrayWithGivenIntAndPrintRemainingQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter the index value : ");
        int in = sc.nextInt();

        int[] br = new int[ar.length];
        int bri = 0;
        if (in < 0 && in > ar.length) {
            System.out.println("Rearrange is not possible");
        } else {
            for (int i = in; i < ar.length; i++) {
                br[bri] = ar[i];
                bri++;
            }
            for (int i = 0; i < in; i++) {
                br[bri] = ar[i];
                bri++;
            }
        }
        System.out.println("Before Array is : ");
        System.out.println(Arrays.toString(ar));
        System.out.println("After rearanging : ");
        System.out.println(Arrays.toString(br));
    }

}
