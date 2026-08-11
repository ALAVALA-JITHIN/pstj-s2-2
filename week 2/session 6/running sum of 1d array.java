public class RunningSum {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        runningSum(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
//output
int[] nums = {1, 2, 3, 4};
1 3 6 10
