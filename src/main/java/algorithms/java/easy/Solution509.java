package algorithms.java.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * LC#509：斐波那契数 Fibonacci Number
 * Link：https://leetcode-cn.com/problems/fibonacci-number/ 思路：
 * 解法1：直接用常规的兔子问题的递归解法：f(n) = f(n -1) + f (n - 2)，因为存在递归，时间和空间的效率都不理想 解法2：
 * 解法2：使用动态规划推到兔子问题的递归公式，降低递归带来的栈开销，空间复杂度降为 O(1)
 */
public class Solution509 {

    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        // return fib(n - 1) + fib(n - 2);
        int p = 0, q = 0, r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    public static void main(String[] args) {
        int result = new Solution509().fib(6);
        System.out.println(result);
    }
}
