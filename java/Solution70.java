/**
 * 70. Climbing Stairs
 * https://leetcode-cn.com/problems/climbing-stairs/
 */
public class Solution70 {

    /**
     * 思路：
     * 刚开始拿到题，觉得是递归的解法，尝试用递归，发现太多重复运算
     * Google看到可以用动态规划的思想来解决
     * 既保存每次解法的结果到r[i]中
     * 每上一层阶梯，就调用上次的结果来计算
     */
    private int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        int[] r = new int[n + 1];
        r[1] = 1;
        r[2] = 2;
        for(int i = 3; i <= n; i++) {
            r[i] = r[i - 1] + r[i - 2];
        }
        return r[n];
    }

    public static void main(String[] args) {
        Solution70 cb = new Solution70();
        int r = cb.climbStairs(10);
        System.out.println("r=" + r);
    }
}