package Arrayyy;

public class PracticeArr {
    public static void main(String[] args) {
        int[] ar = { 1, 2, 1, 2, 3, 4, 4, 4, 5 };
        boolean[] bl = new boolean[ar.length];
        for (int i = 0; i < ar.length; i++) {
            int count = 1;
            if (bl[i] == false) {
                for (int j = i + 1; j < ar.length; j++) {
                    if (ar[i] == ar[j]) {
                        count++;
                        bl[j] = true;
                    }
                }
                System.out.println(ar[i] + " " + count);
            }
        }
    }
}
