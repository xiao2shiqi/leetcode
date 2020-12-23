package algorithms.java.easy;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * LC#414 第三大的数 Third Maximum Number
 * Link：https://leetcode-cn.com/problems/third-maximum-number/
 * 思路1：使用有序哈希 TreeSet， 然后取出倒数第三的元素，如果没有取出 last （最大）元素
 * @author Phoenix on 2020/12/23 8:40 上午
 */

public class Solution414 {


    public int thirdMax(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums) {
            treeSet.add(num);
        }
        if (treeSet.size() >= 3) {
            // 存在第三大的元素
            int i = 0, targetValue = treeSet.size() - 3;
            for (Integer integer : treeSet) {
                if (i == targetValue) return integer;
                i += 1;
            }
        }
        // 直接返回最大元素
        return treeSet.last();
    }

    public static void main(String[] args) {

//        int [] nums = {3, 2, 1};
        int [] nums = {1, 2, -2147483648};

        Solution414 solution414 = new Solution414();
        System.out.println("max number :" + solution414.thirdMax(nums));

//        TreeSet<Integer> treeSet = new TreeSet();
//        treeSet.add(1);
//        treeSet.add(2);
//        treeSet.add(3);
//        treeSet.add(4);
//        treeSet.add(5);
//        treeSet.add(6);
//
//        int i = 0;
//        int targetValue = treeSet.size() - 3;
//        for (Integer integer : treeSet) {
//            if (i == targetValue) {
//
//                System.out.println("target: " + integer);
//            }
//            i += 1;
//        }

    }
}