package Practice2;

import java.util.Arrays;

public class LargeConsecutive {
    public static void main(String[] args)  {
        int[] ar1 = { 100, 4, 200, 1, 3, 2 }; // 4
        int[] ar2 = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 }; // 9

        int[] sorted = arSort(ar1);
        System.out.println(Arrays.toString(sorted));
        int s = sequenceS(sorted);
        System.out.println("Length of the consequtive array is : " + s);
    }

    private static int[] arSort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    int temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }
        return ar;
    }

    public static int sequenceS(int[] ar) {
        int count = 1;
        for (int i = 0; i <ar.length; i++) {
           try{
             if (ar[i] < ar[i + 1] && (ar[i] + 1) == ar[i + 1]) {
                count++;
            }
           }catch(Exception e){
            System.out.println("Hi");
           }
        }
        return count;
    }
}
