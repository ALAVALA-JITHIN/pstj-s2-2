import java.util.Scanner;

public class Main {

    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxSubArray(nums);

        System.out.println("Maximum subarray sum: " + result);

        sc.close();
    }
}

//output
Enter the size of array: 9
Enter array elements:
-2 1 -3 4 -1 2 1 -5 4
Maximum subarray sum: 6
