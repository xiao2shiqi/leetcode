import java.util.Arrays;

/**
 * LC#643  Maximum Average Subarray I
 * Link：https://leetcode-cn.com/problems/maximum-average-subarray-i/
 * 思路：这道理作者要考察的知识点:滑动窗口来统计连续数组的最大值，减去滑出元素，加上滑入元素，得到当前连续序列，公式：sum = sum - nums[i-k] + nums[i]
 */
public class S643 {

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        // 统计 top k 的初始值
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        // 使用临时变量 maxSum 保存连续序列的最大值
        int maxSum = sum;
        // 这道理作者要考察的知识点:滑动窗口来统计连续数组的最大值
        for (int i = k; i < n; i++) {
            // 减去滑出元素，加上滑入元素，得到当前连续序列的 sum
            sum = sum - nums[i-k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return 1.0 * maxSum / k;
    }


    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double findMaxAverage = findMaxAverage(nums, k);
        System.out.println("findMaxAverage result:" + findMaxAverage);
    }

}
