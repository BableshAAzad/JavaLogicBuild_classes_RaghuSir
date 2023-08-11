package Array.ReverseOfArray;

public class ReverseTheArray {
    public static void main(String[] args) {
        OperationRevArr ra = new OperationRevArr();
        int[] x = ra.readArray();
        System.out.println("User Enter array is : ");
        ra.display(x);

        System.out.println("Reverse of array is : ");
        ra.reverse(x);
    }
}
