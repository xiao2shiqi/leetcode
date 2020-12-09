package algorithms.java.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LC#119 Pascal's Triangle II 杨辉三角 II
 * Link：https://leetcode-cn.com/problems/pascals-triangle-ii/
 * 思路1：直接套用 LC#118 解法，返回 row 指定层的数组即可，缺点：代码多并且复杂，空间复杂度差，甚至达不到作者要求 O(k) 的要求
 * 思路2（runtime beats）：直接套用组合公式 c = c*(n-m)/(m+1)，直接计算当前层，符合空间复杂度 O(k) 的要求，比解法1代码量少了很多，性能也更好
 */
public class PascalsTriangleII {

    public List<Integer> getRow(int row) {
        List<Integer> r = new ArrayList<>();
        long cur = 1;
        for (int i = 0; i <= row; i++) {
            r.add((int)cur);
            cur = cur * (row - i) / (i + 1);
        }
        return r;
    }

    public static void main(String[] args) {
//        PascalsTriangleII pascalsTriangle = new PascalsTriangleII();
//        List<Integer> generate = pascalsTriangle.getRow(10);
//        System.out.println(generate);

        int[] a = new int[]{1,2,3};
        System.out.println(Arrays.toString(a));
        a = new int[a.length + 1];
        System.out.println(Arrays.toString(a));
    }

}
