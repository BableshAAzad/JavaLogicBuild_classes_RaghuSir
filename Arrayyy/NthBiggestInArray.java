package Arrayyy;

public class NthBiggestInArray {
    public static void main(String[] args) {
        int[] ar = { 3, 4, 1, 6, 5 };
       int res = nthLagest(ar, 2);
       System.out.println(res);
       
    }
    static int nthLagest(int[] ar, int n) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
          
            for (int j = 0; j < ar.length; j++) {
                if (ar[j] > ar[i]){
                    count++;
                }
            }
            if (count == n - 1)
                return ar[i];
        }
        System.out.println(count);
        return 0;
    }
}
