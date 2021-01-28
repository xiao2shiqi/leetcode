package algorithms.java.easy;

/**
 * LC#7：ReverseInteger 整数反转
 * https://leetcode-cn.com/problems/reverse-integer/
 * 思路1（runtime beats 最优解）：通过%10将整数从尾数弹出放入r中，x弹完=0时，返回r（判断溢出）
 */
public class Solution7 {

    public static int reverse(int x) {
        // 用 long 就不会溢出了
        long r = 0;
        while(x != 0) {
            int pop = x % 10;
            x = x / 10;
            r = r * 10 + pop;
        }
        return r > Integer.MAX_VALUE || r < Integer.MIN_VALUE ? 0 : (int) r;
    }

    public static void main(String[] args) {
        int x = 12345678;
        System.out.println(Solution7.reverse(x));
    }
}