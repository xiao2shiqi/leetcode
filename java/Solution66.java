import java.util.Arrays;

/**
 * LC#66：Plus One
 * Link：https://leetcode-cn.com/problems/plus-one/
 * 通过 for 从数组尾部开始 + 1，没有遇到 0 则直接返回，遇到0 则继续向上 + 1，当数组全为 0 时，在头部扩容，插入 1
 */
public class Solution66 {

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            // 从尾部开始 加1
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0){
                return digits;
            }
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {1, 9, 9};
        nums = plusOne(nums);
        System.out.println(Arrays.toString(nums));
    }
}
