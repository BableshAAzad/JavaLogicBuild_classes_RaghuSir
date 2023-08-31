package Test_VI_Array;

public class DistinctArrayInTwoArray {
    public static void main(String[] args) {
        System.out.println("Enter first Array details : ");
        int[] ar = MainClassVII.readArrayy();
        System.out.println("Enter second array details : ");
        int[] br = MainClassVII.readArrayy();
        int[] cr = disctintArr(ar, br);
        MainClassVII.displayy(cr);
    }

    static int[] disctintArr(int[] ar, int[] br) {
        int[] cr= new int[ar.length+br.length];
        int i=0, j=0, k=0;
        while(i<ar.length || j<br.length){
            if(ar[i]!=br[j])
                cr[k]=ar[i];
                i++;
                j++;
                k++;
        }
        while(i<ar.length){
            cr[k] = ar[i];
            i++;
            k++;
        }
        while(j<br.length){
            cr[k] = br[j];
            k++;
            j++;
        }
        return cr;
    }
}
