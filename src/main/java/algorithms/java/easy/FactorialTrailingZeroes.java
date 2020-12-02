package algorithms.java.easy;

/**
 * LC#172 Factorial Trailing Zeroes 计算阶乘后的零
 * Link：https://leetcode-cn.com/problems/factorial-trailing-zeroes/
 * 思路1 O（n） 解法：计算阶乘：先计算循环计算阶乘，然后通过求模%运算计算零的数量（达不到官方要求的 O(log n) 时间复杂度），提交 CASE 会超出时间限制
 * 思路2 O(log n) 解法，计算因子: 思路1的解法太慢，分析题目会发现阶乘尾部的零是由计算因子5来决定，所以只要计算n里面5的数量，就可以做到作者要求的对数级别 O(logN) 的运行效率
 * 总结：首先想到的是 思路1，思路2 是看了官方解题才有的思路，看评论区貌似还有一种稳定的对数级别的高效计算因子的解法，看看有没有小伙伴去研究一下，总体感觉这道题确实有点难。。花了差不多 2小时
 */
public class FactorialTrailingZeroes {

    public static int trailingZeroes(int n) {
        int zeroCount = 0;
        for (int i = 5; i <= n; i+=5) {
            int currentFactor = i;
            while (currentFactor % 5 == 0) {
                zeroCount++;
                currentFactor /= 5;
            }
        }
        return zeroCount;
    }

    public static void main(String[] args) {
        int r = FactorialTrailingZeroes.trailingZeroes(10);
        System.out.println(r);
    }
}
