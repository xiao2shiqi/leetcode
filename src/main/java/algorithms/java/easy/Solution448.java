package algorithms.java.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * LC#448：Find All Numbers Disappeared in an Array 找到所有数组中消失的数字
 * Link：https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 * 思路：
 * 解法1：哈希：思路很简单，先将 nums.length 循环加入哈希，然后遍历 nums[] 将哈希表内不存在的值放入 list 并且返回（效率比较低，空间复杂度 O(n)）
 * 解法2：索引位更新，遍历 nums[]，将索引值更改为负数，如果数组齐全，那么正常情况所有 value 都会更新为负数，然后遍历数组，未更新为负数的索引位，就是丢失的数字（空间复杂度 O(1)）
 */
public class Solution448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int newIndex = Math.abs(nums[i]) - 1;
            if (nums[newIndex] > 0) {
                nums[newIndex] *= -1;
            }
        }

        List<Integer> result = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] > 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1};
        List<Integer> list = new Solution448().findDisappearedNumbers(nums);
        System.out.println(list);

    }

}
