import java.util.Arrays;

/**
 * LC#1480:一维数组动态和
 * Link: https://leetcode-cn.com/problems/running-sum-of-1d-array/
 * 思路：动态规划 DP 普通题
 * @author Phoenix on 2021/5/29.
 */
public class S1480 {

    public static int[] runningSum(int[] nums) {
        int lastValue = 0;
        for (int i = 0; i < nums.length; i++) {
            lastValue += nums[i];
            nums[i] = lastValue;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

}
