package algorithms.java.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode #1 Two Sum
 * https://leetcode-cn.com/problems/two-sum/
 *
 * 时间复杂度：O(n)
 * 思路：
 * 1 两次哈希求解
 * 2 将数组放入散列表
 * 3 遍历散列表，通过target-key得出匹配数组
 * 4 并且判断非自身元素，返回数组
 */
public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            int targetKey = target - nums[i];
            if(hashMap.containsKey(targetKey) && hashMap.get(targetKey) != i) return new int[]{i, hashMap.get(targetKey)};      //不跟自己匹配
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
