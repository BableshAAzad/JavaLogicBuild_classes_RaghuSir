package Arrayyy.SumOfArrayAndReplaceBySum;

class ReplaceEveryArrayByThereSum {
     public static void main(String[] args) {
        OprationArraySum ao = new OprationArraySum();
        int[] x = ao.readArray();
        System.out.println("User enter array : ");
        ao.display(x);

        System.out.println("Sum of Array is : ");
        ao.updateBySum(x);
     }
}
