package algorithms.java.easy;

import java.util.Arrays;

/**
 * LC#268 Missing Number 消失的数字
 * Link：https://leetcode-cn.com/problems/missing-number/
 * 思路：
 * 1：排序 + 遍历：首先排序数组，然后遍历数组，如果当前节点 -1 != [currentNode - 1] 则表示数组不连续，返回当前节点，否则返回 -1
 * 2：哈希：首先将数组加入哈希表，然后根据哈希表 length 开始遍历，如果判断哈希表不包含该元素则表示，当前元素不连续，否则返回 -1
 * @author Phoenix on 2021/1/15.
 */
public class Solution268 {

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);

        // 判断 n 是否出现在末位和首位，O（1）复杂度返回
        if (nums[nums.length - 1] != nums.length) {
            return nums.length;
        } else if (nums[0] != 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            int currentNum = nums[i];
            if (currentNum != (nums[i - 1] + 1)) {
                return nums[i - 1] + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        int missingNumber = missingNumber(nums);
        System.out.println("missingNumber: " + missingNumber);

    }

}
