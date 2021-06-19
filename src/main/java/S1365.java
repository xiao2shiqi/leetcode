import java.util.Arrays;

/**
 * LC#1365：How Many Numbers Are Smaller Than the Current Number
 * Link：https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * 思路一：首先想到的就是：嵌套循环的暴力解法，打败 46% 对手，时间：O(n2)，效率并不高
 * 思路二：计数排序（桶排序），时间复杂度：O(N + K)，应该是最优解
 */
public class S1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cnt = new int[101];
        int n = nums.length;
        // 把数组放入桶中
        for (int i = 0; i < n; i++) {
            cnt[nums[i]]++;
        }
        for (int i = 1; i <= 100; i++) {
            cnt[i] += cnt[i - 1];
        }
        int[] ret = new int [n];
        // 从桶中取出结果
        for (int i = 0; i < n; i++) {
            ret[i] = nums[i] == 0 ? 0 : cnt[nums[i] - 1];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] res = new S1365().smallerNumbersThanCurrent(nums);
        System.out.println("res --------->");
        System.out.println(Arrays.toString(res));
    }
}
