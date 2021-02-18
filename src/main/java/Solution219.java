import java.util.HashSet;
import java.util.Set;

/**
 * LC#219 存在重复元素 II Contains Duplicate II
 * Link：https://leetcode-cn.com/problems/contains-duplicate-ii/
 * 思路1（optimum solution 最优解）：通过 Hash 来解
 * 感受：这道题看了半天，不知道作者要表达什么，最后参考论坛的解法，也还是不知道题目的目的是什么，真是有点怀疑自己的智商
 */
public class Solution219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            // 哈希包含数组元素，则返回 true
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if(set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1}; int k = 1;
        boolean containsNearbyDuplicate = Solution219.containsNearbyDuplicate(nums, k);
        System.out.println("containsNearbyDuplicate:" + containsNearbyDuplicate);
    }
}
