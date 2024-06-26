package ArrayProblem;

import java.util.Arrays;

public class Problem2574 {
    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] result = new int[nums.length];
        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;
        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = nums[i - 1] + leftSum[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum[i] = nums[i + 1] + rightSum[i + 1];
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
}
