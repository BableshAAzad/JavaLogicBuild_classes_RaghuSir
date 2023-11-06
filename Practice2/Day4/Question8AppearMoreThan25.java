package Practice2.Day4;

public class Question8AppearMoreThan25 {
    /**
     * Example 1:Input: arr = [1,2,2,6,6,6,6,7,10] Output: 6
     * Example 2: Input: arr = [1,1] Output: 1
     */
    public static void main(String[] args) {
        int[] ar = { 1, 2, 2, 6, 6, 6, 6, 7, 10 };
        printFrequencyN(ar);
    }

    static void printFrequencyN(int[] ar) {
        int big = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > big)
                big = ar[i];
        }
        int[] count = new int[big + 1];
        for (int j = 0; j < ar.length; j++) {
            count[ar[j]]++;
        }
        int temp = 0;
        for (int k = 0; k < ar.length; k++) {
            if (count[ar[k]] != 0) {
                if (count[ar[k]] >= temp) {
                    temp = ar[k];
                }
                count[ar[k]] = 0;
            }
        }
        System.out.println(temp);
    }
}
