package algorithms.java.easy;

/**
 * leetcode #53. Maximum Subarray
 * link : https://leetcode-cn.com/problems/maximum-subarray/comments/
 */
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int res = nums[0];  //负责保存累计的最大值
        int sum = 0;        //负责累计总和
        for (int num : nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            res = Math.max(res, sum);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("result :" + maxSubArray(nums));
    }
}
