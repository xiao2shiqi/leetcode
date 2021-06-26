import java.util.*;

/**
 * LC#350： 两个数组的交集 II
 * Link：https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 * 思路1：将数组放进 hash 桶中记数，取出当 count > 1 则为数组的交集，最终重定义数组范围
 * 思路2：排序 + 双指针遍历，遍历两个数组，如果元素相等则加入结果集，如果元素不相等则较小的元素右移一位，直到数组遍历结束，时间复杂度 log n，空间复杂度O(1)
 * 思路3：直接使用 Java List 容器实现 （时间，空间效率都很低）
 * @author Phoenix on 2021/6/26.
 */
public class S350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for (int num : nums1) {
            list1.add(num);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int num : nums2) {
            if (list1.contains(num)) {
                list2.add(num);
                // 从 list1 除去已匹配的数值
                list1.remove(Integer.valueOf(num));
            }
        }
        int[] res = new int[list2.size()];
        int i = 0;
        for (int num : list2) {
            res[i++] = num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] ints = new S350().intersect(nums1, nums2);
        System.out.println(Arrays.toString(ints));
    }
}