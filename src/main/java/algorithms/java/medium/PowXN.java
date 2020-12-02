package algorithms.java.medium;

/**
 * LC#50 Pow(x, n)  实现 pow(x, n) ，即计算 x 的 n 次幂函数
 * Link：https://leetcode-cn.com/problems/powx-n/
 * 思路：暴力破解
 */
public class PowXN {

    public static double myPow(double x, int n) {
        double index = x;
        for (int i = 1; i < n; i++) {
            x = x * index;
        }
        return x;
    }

    public static void main(String[] args) {
        double result = myPow(2, 10);
        System.out.println("result : " + result);
    }

}
