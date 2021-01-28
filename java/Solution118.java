import java.util.ArrayList;
import java.util.List;

/**
 * LC#118 Pascal's Triangle 杨辉三角
 * Link: https://leetcode-cn.com/problems/pascals-triangle/solution/yang-hui-san-jiao-by-leetcode/
 * 思路1：根据 numRows 构建数组层数，杨辉三角可以归类为动态规划，核心思路是基于上一层 prevRow 保存的数据，来构建当前层 row 数组
 * 思路2：直接套用组合公式 c = c*(n-m)/(m+1)，根据 numRows 计算出每层的元素，放入层级集合 triangle 中
 * 执行效率：O(n2)
 */
public class Solution118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int k = 0; k < numRows; k++) {
            List<Integer> r = new ArrayList<>();
            long cur = 1;
            for (int i = 0; i <= k; i++) {
                r.add((int)cur);
                cur = cur * (k - i) / (i + 1);
            }
            triangle.add(r);
        }
        return triangle;
    }

    public static void main(String[] args) {
        Solution118 pascalsTriangle = new Solution118();
        List<List<Integer>> generate = pascalsTriangle.generate(10);
        System.out.println(generate);
    }

}
