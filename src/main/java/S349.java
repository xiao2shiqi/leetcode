import java.util.*;

/**
 * LC#349：两个数组的交集
 * Link：https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * Solution：熟悉一下 Java 集合的用法。。。
 */
public class S349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>(),set2 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i:nums1){
            list.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }
        list.retainAll(set2);
        set1.addAll(list);
        return set1.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] intersection = new S349().intersection(nums1, nums2);
        System.out.println(intersection);
    }
}
