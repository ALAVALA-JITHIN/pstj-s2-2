public class Main {

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        int j = 0;

        for (int i = 0; i < n; i++) {
            result[j++] = nums[i];
            result[j++] = nums[i + n];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = shuffle(nums, n);

        System.out.print("Output: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}


//output
Output: 2 3 5 4 1 7
