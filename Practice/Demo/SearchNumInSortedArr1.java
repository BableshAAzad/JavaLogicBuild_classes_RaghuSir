package Practice.Demo;

public class SearchNumInSortedArr1 {
    public static int searchInsert(int[] nums, int target) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target && nums[i] - 1 == target) {
                if (i == 0) {
                    temp = 0;
                    break;
                } else if (nums[i] > target && nums[i] - 1 == target) {
                    temp = i;
                    break;
                } else if (nums[i] - 1 == target) {
                    temp = i - 1;
                    break;
                }
                temp = i;
                break;
            } else if (nums[i] < target && nums[i] + 1 == target) {
                if (i == nums.length - 1) {
                    temp = i + 1;
                    break;
                } else if (nums[i] < target && target == nums[i] + 1) {
                    temp = i + 1;
                    break;
                }
                temp = i;
                break;
            } else if (target < nums[i] && target > nums[i] + 1) {
                temp = i;
                break;
            } else if (nums[i] == target) {
                temp = i;
                break;
            } else if (nums[i] < target && nums[i] + 2 == target && i == nums.length - 1) {
                temp = i + 1;
                break;
            }else if (nums[i]<target && i==nums.length-1){
                temp = i+1;
                break;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        // int[] arr = {1,3,5,6};
        // int n = 7; //7=>4 // 2=>1// 5=>2
        // int[] arr = { 2, 5 };
        // int n = 1; // 1
        // int[] arr = { 3,6,7,8,10};
        // int n = 5; // 1
        int[] arr = { 1, 2, 3, 5 };
        int n = 8; // 4
        int res = searchInsert(arr, n);
        System.out.println(res);
    }
}
