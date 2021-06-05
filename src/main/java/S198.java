/**
 * LC#198 House Robber 打家劫舍
 * Link：https://leetcode-cn.com/problems/house-robber/
 * 思路1：使用一个 dp 数组保存数组对应下标可偷取的最高金额，最终返回 dp[length - 1] 为最高可偷取的金额（参考官网答案，DP 真的需要智商）
 */
public class S198 {

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[length - 1];
    }

    public static void main(String[] args) {
        int[] nums_1 = {1,2,3,1};
        int[] nums_2 = {2,7,9,3,1};
        System.out.println("result:" + S198.rob(nums_2));

    }
}

