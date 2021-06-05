/**
 * LC#263: Ugly Number
 * Link：https://leetcode-cn.com/problems/ugly-number/
 * 思路：对 n 反复除以 2,3,5 直到 n 不再包含质数，剩下的数为1，则是丑数
 *
 * @author Phoenix on 2021/5/9.
 */
public class S263 {

    private static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int n = 6;
        boolean res = isUgly(n);
        System.out.println(res);
    }
}
