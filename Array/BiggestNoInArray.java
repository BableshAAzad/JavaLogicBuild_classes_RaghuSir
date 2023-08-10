package Array;

public class BiggestNoInArray {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[] x = ao.readArray();
        System.out.println("User enter array : ");
        ao.display(x);
        int big = ao.getBiggest(x);
        System.out.println("Beggest value is : " + big);
    }
}
