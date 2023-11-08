package Practice;

public class SearchNumInSortedArr {
    public static int searchInsert(int[] nums, int target) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]){
                temp = i;
                break;
            }
            else if (target == 0 && nums[i] != target){
                temp = 0;
                break;
            }
            else if (target < nums[i]){
                temp= nums[i]-1;
                break;
            }
            else if (target > nums[i] && (nums[i] + 1) == target){
                temp = i + 1;
                break;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        // int[] arr = {1,3,5,6};
        // int n = 7; // 4 // 2=>4// 5=>2
        // int[] arr = { 2, 5 };
        // int n = 1; // 1
        int[] arr = { 3,6,7,8,10};
        int n = 5; // 1
        int res = searchInsert(arr, n);
        System.out.println(res);
    }
}
