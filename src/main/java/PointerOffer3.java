import java.util.HashSet;
import java.util.Set;

/**
 * LC#OF03: 数组中重复的数字
 * Link：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * 思路：哈希排重
 */
public class PointerOffer3 {

    public static int findRepeatNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<>(nums.length);
        for (int num : nums) {
            if (hashSet.contains(num)) return num;
            hashSet.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int res = findRepeatNumber(nums);
        System.out.println(res);
    }
}
