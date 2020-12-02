package algorithms.java.easy;

import java.math.BigInteger;

/**
 * LC#172 Factorial Trailing Zeroes 计算阶乘后的零
 * Link：https://leetcode-cn.com/problems/factorial-trailing-zeroes/
 * 思路：先计算阶乘，然后通过求模%运算计算零的数量（达不到官方要求的 O(log n) 时间复杂度）
 *
 */
public class FactorialTrailingZeroes {

    public static int trailingZeroes(int n) {
        // 这里使用 BigInteger 计算阶乘，防止阶乘导致 Integer 溢出
        // Calculate n!
        BigInteger nFactorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            nFactorial = nFactorial.multiply(BigInteger.valueOf(i));
        }

        // Count how many 0's are on the end.
        int zeroCount = 0;
        BigInteger mod = nFactorial.mod(BigInteger.TEN);
        while (mod.equals(BigInteger.ZERO)) {
            nFactorial = nFactorial.divide(BigInteger.TEN);
            zeroCount++;
        }
        return zeroCount;
    }

    public static void main(String[] args) {
        int r = FactorialTrailingZeroes.trailingZeroes(13);
        System.out.println(r);
    }
}
