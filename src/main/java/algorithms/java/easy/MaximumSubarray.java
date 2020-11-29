package algorithms.java.easy;

/**
 * LC#53. Maximum Subarray 最大子序和
 * link : https://leetcode-cn.com/problems/maximum-subarray/comments/
 * 思路：刚开始没什么解题思路，看了官方解题才明白要用到动态规划来解，大概是用 pre 用于遍历记录运算的结果，maxAns 用于保存最大连续序列和的值，遍历完数组返回 maxAns 即可
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println("result :" + maximumSubarray.maxSubArray(nums));
    }
}
