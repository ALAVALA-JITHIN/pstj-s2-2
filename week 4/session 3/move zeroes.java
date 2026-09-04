import java.util.*;

public class Main {

    public static void moveZeroes(int[] nums) {

        int index = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill remaining positions with zero
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));

        sc.close();
    }
}

//output:
5
0 1 0 3 12


[1, 3, 12, 0, 0]
