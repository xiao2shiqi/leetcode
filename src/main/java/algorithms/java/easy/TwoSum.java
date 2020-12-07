package algorithms.java.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * LC#1 Two Sum 两数之和
 * https://leetcode-cn.com/problems/two-sum/
 * 思路1：2次哈希求解：将数组放入散列表，遍历散列表，通过target-key得出匹配数组，并且判断非自身元素，返回数组，时间复杂度 O（n）
 * 思路2[runtime beats（最优解）]：1次哈希求解：在遍历 num 数组，如果哈希表不包含 target - num[i] ，则将 num[i], i 放入哈希表，如果包含则直接返回 [hash[num[i], i]] 下标
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 如果包含目标值
            if(hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }
}
