import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LC#15：3Sum
 * Link：https://leetcode-cn.com/problems/3sum/
 * Solution：
 * 1：Hash：最初的想法将 b 和 c 放入 Hash 中，然后逐渐从 Hash 中取计算 a + b + c = 0，时间复杂度 O(n2)，空间复杂度 O(n)
 * 2：Sort + Find：刚开始一直想用 Hash 来解题，因为比较简单直观，但是论坛似乎都在推荐这种做法，确实高效，但是代码也更加复杂。先用排序排一排，找到 a 后，再用双指针在剩下的元素中找 b 和 c，时间复杂度 O（n2），空间复杂度 O（1）
 */
public class S15 {

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        // 枚举 a
        for (int first = 0; first < n; first++) {
            // 跳过相同的值
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int third = n - 1;
            int target = -nums[first];
            // 枚举 b
            for (int second = first + 1; second < n; second++) {
                // 跳过相同的值
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }
                // 不可能有结果，退出循环
                if (second == third) {
                    break;
                }

                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = new S15().threeSum(nums);
        System.out.println(list);
    }
}
