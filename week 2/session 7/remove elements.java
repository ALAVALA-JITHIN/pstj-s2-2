public class Main {

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = removeElement(nums, val);

        System.out.println("k = " + k);

        System.out.print("nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);

            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
//output
Example 1:
Input: nums = [3,2,2,3], val = 3
Output: k = 2
Modified nums = [2,2,_,_]

Example 2:
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: k = 5
Modified nums = [0,1,3,0,4,_,_,_]
