package Practice.Demo;

public class SingleNumber136 {
    public static void singleNumber(int[] nums) {
        boolean[] bl = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (bl[i] == false) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        bl[i] = true;
                        bl[j] = true;
                    }
                }
            }
        }
        for (int i = 0; i < bl.length; i++) {
            if (bl[i] == false)
                System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1 };
        singleNumber(arr);
        String s = "";
        // String[] ss = s.toCharArray();
    }
}
