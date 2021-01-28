package algorithms.java.easy;

/**
 * LC#67 Add Binary 二进制求和
 * Link：https://leetcode-cn.com/problems/add-binary/
 * 思路：通过 Integer 内置函数，将 params a + params b 结果转为二进制
 */
public class Solution67 {

    public String addBinary(String a, String b) {
        int i = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(i);
    }

}