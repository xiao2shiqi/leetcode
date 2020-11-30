package algorithms.java.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * LC#118 Pascal's Triangle 杨辉三角
 * Link: https://leetcode-cn.com/problems/pascals-triangle/solution/yang-hui-san-jiao-by-leetcode/
 * 思路：根据 numRows 构建数组层数，杨辉三角可以归类为动态规划，核心思路是基于上一层 prevRow 保存的数据，来构建当前层 row 数组
 * 执行效率：O(n2)
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        // 如果传0则返回空三角
        if (numRows == 0) return triangle;
        // 初始化第一层
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        // 根据 num 构建三角高度
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            // row 当前层， prevRow 上一层
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);
            // 当前层元素永远为 1
            row.add(1);
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            // 尾部元素永远为 1
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> generate = pascalsTriangle.generate(5);
        System.out.println(generate);
    }

}
