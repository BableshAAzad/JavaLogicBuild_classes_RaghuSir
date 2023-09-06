package Test_VI_Array;

public class DistinctArrayInTwoArrayQ2 {
    public static void main(String[] args) {
        System.out.println("Enter first Array details : ");
        int[] ar = MainClassVII.readArrayy();
        System.out.println("Enter second array details : ");
        int[] br = MainClassVII.readArrayy();
        int[] cr = disctintArr(ar, br);
        MainClassVII.displayy(cr);
    }

    static int[] disctintArr(int[] ar, int[] br) {
        int[] cr = new int[ar.length + br.length];
        for (int i = 0; i < ar.length; i++) {
            cr[i] = ar[i];
        }
        for (int i = 0; i < br.length; i++) {
            cr[i + ar.length] = br[i];
        }
        boolean[] bl = new boolean[cr.length];
        int count = 0;
        for (int i = 0; i < cr.length; i++) {
            if (bl[i] == false) {
                for (int j = i + 1; j < cr.length; j++) {
                    if (cr[i] == cr[j]) {
                        bl[i] = true;
                        count++;
                    }
                }
            }
        }
        int[] dr = new int[cr.length - count];
        int m = 0;
        for (int i = 0; i < cr.length; i++) {
            if (bl[i] == false)
                dr[m++] = cr[i];
        }
        return dr;
    }
}
