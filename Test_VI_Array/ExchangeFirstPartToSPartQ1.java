package Test_VI_Array;

public class ExchangeFirstPartToSPartQ1 {
    public static void main(String[] args) {
        int[] ar = MainClassVII.readArrayy();
        int[] br = exchangeFS(ar);
        MainClassVII.displayy(br);
    }

    static int[] exchangeFS(int[] ar) {
        int a = ar.length / 2;
        for (int i = 0; i < ar.length / 2; i++) {
            int temp = ar[i];
            ar[i] = ar[a];
            ar[a] = temp;
            a++;
        }
        return ar;
    }
}
