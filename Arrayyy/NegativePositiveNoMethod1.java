package Arrayyy;

public class NegativePositiveNoMethod1 {
    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 4, 5, -7, 6, 7, 8, 9, -1, -4 };
        int[] nve = new int[ar.length];
        int[] pve = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 0)
                nve[i] = ar[i];
            else
                pve[i] = ar[i];
        }
        // ----------------------------------------------------
        System.out.println("Here negative number is : ");
        for(int i=0; i<nve.length; i++){
            if(nve[i] != 0)
              System.out.print(nve[i]+" ");
        }
        System.out.println();
        System.out.println("Here positive number is : ");
        for(int i=0; i<pve.length; i++){
            if(pve[i] != 0)
              System.out.print(pve[i]+" ");
        }
    }
}
