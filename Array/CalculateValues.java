package Array;

public class CalculateValues {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[] x = ao.readArray();
        System.out.println("User enter array : ");
        ao.display(x);

        int small = ao.getSmallest(x);
        System.out.println("Smalles value is : " + small);

        int sum = ao.getSum(x);
        System.out.println("Sum of array is : " + sum);

        System.err.println("There prime numeber is : ");
        ao.getPrimeNumbers(x);

         int r = ao.getPalindm(x);
        System.err.println("There palindrome numeber is : "+r);
    }
}
