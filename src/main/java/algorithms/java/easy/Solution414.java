package algorithms.java.easy;

import com.sun.source.tree.Tree;

import java.util.*;

/**
 * LC#414 第三大的数 Third Maximum Number
 * Link：https://leetcode-cn.com/problems/third-maximum-number/
 * 思路1（非最优）：使用 sort 和 hash 将数组排序 + 去重，然后根据结果集决定取倒数第三大的数字，还是最大的数字
 * @author Phoenix on 2020/12/23 8:40 上午
 */

public class Solution414 {

    public int thirdMax(int[] nums) {
        // 使用 sort + List 实现排序 + 去重
//        Arrays.sort(nums);
//        List<Integer> list = new ArrayList<>();
//        for (int num : nums) {
//            if (!list.contains(num)) list.add(num);
//        }
//        return list.size() >= 3 ? list.get(list.size() - 3) : list.get(list.size() - 1);

        // 使用 TreeSet 实现排序 + 去重
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        for (int num : nums) {
            set.add(num);
        }
        Iterator<Integer> iterator = set.iterator();
        if (set.size() < 3) {
            return iterator.next();
        }
        iterator.next();
        iterator.next();
        return iterator.next();
    }

    public static void main(String[] args) {

//        int [] nums = {3, 2, 1};
        int [] nums = {1, 2};

        Solution414 solution414 = new Solution414();
        System.out.println("max number :" + solution414.thirdMax(nums));


    }
}