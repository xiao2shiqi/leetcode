/**
 * LC#53. Maximum Subarray 最大子序和
 * link : https://leetcode-cn.com/problems/maximum-subarray/comments/
 * 思路：刚开始没什么解题思路，看了官方解题才明白要用到动态规划来解，大概是用 pre 用于遍历记录运算的结果，maxAns 用于保存最大连续序列和的值，遍历完数组返回 maxAns 即可
 */
public class Solution53 {

    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = pre + x > x ? pre + x : x;
            maxAns = maxAns > pre ? maxAns : pre;
        }
        return maxAns;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Solution53 maximumSubarray = new Solution53();
        System.out.println("result :" + maximumSubarray.maxSubArray(nums));
    }
}
