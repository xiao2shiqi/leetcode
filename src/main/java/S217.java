import java.util.*;

/**
 * LC#217 ContainsDuplicate 存在重复元素
 * Link：https://leetcode-cn.com/problems/contains-duplicate/
 * 思路1（runtime beats）: 基本不怎么思考就想到用哈希表查重，遍历数组，找到重复就返回 true，没有就进入哈希表保存，时间复杂度 O(n)
 * 思路2 ：先将数组排序，然后对象相邻 2个元素是否出现相等的情况，时间复杂度 O(n log n)
 */
public class S217 {

    public static boolean containsDuplicate(int[] nums) {
        // 思路1 解法
//        Set<Integer> set = new HashSet<>(nums.length);
//        for (int x: nums) {
//            if (set.contains(x)) return true;
//            set.add(x);
//        }

        // 思路2 解法
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) return true;
        }
        return false;
    }

    public static void main(String[] args) {

//        int[] nums = {1,2,3,1};     // CASE 1   true
//        int[] nums = {1,2,3,4};     // CASE 2 false
        int[] nums = {1,1,1,3,3,4,3,2,4,2};     // CASE 3  true

        boolean r = containsDuplicate(nums);
        System.out.println("r:" + r);

    }
}
