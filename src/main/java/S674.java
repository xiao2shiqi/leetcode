/**
 * LC#674：Longest Continuous Increasing Subsequence
 * Link：https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/
 * 思路：使用贪心策略获得尽可能长的子序列，使用循环 nums 计算递增序列，start 计算统计开始的下标位，因为 nums[i] <= nums[i -1] 时就不可能存在连续递增序列，所有将 start = i，最终使用 ans 保存当前最长的递增徐磊
 */
public class S674 {

    public static int findLengthOfLCIS(int[] nums){
        int ans = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            // 记录中断下标，重新统计 start 位
            if (i > 0 && nums[i] <= nums[i - 1]) start = i;
            ans = Math.max(ans, i - start + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        // int[] nums = {1,3,5,4,2,3,4,5};
        int[] nums = {1, 3, 5, 4, 7};
        int res = findLengthOfLCIS(nums);
        System.out.println("res>" + res);
    }
}
