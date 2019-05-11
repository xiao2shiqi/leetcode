package algorithms.java.easy;

import java.util.Arrays;

/**
 * #66. Plus One
 * https://leetcode-cn.com/problems/plus-one/
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        if(digits.length == 0) return digits;

        int i = digits.length - 1;
        while (i >= 0) {
            int r = digits[i] + 1;
            if(r < 10){
                digits[i] = r;
                return digits;
            } else {
                digits[i] = 0;
                i--;
            }
        }

        if(digits[0] == 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int j = 0; j < digits.length; j++) {
                newDigits[j + 1] = digits[j];
            }
            return newDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {9};
        nums = plusOne(nums);
        System.out.println(Arrays.toString(nums));
    }
}
