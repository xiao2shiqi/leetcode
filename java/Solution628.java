/**
 * LC#628 三个数的最大乘积 Maximum Product of Three Numbers
 * Link：https://leetcode-cn.com/problems/maximum-product-of-three-numbers/
 * 思路1：排序数组，存在正数和负数两种情况，对比两种情况返回的值，返回最大值
 * 思路2：原地找出 5个计算数（3个最大正数，2个最大负数），计算出结果值，返回最大值（因为减少排序，所以效率更高）
 */
public class Solution628 {
    
    public int maximumProduct(int[] nums) {
        // 初始化 5个最大最小数
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int x : nums) {
            // 找出三个最大正数
            if (x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max3 = max2;
                max2 = x;
            } else if (x > max3) {
                max3 = x;
            }
            // 找出两个最大负数
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min2 = x;
            }
        }
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3};
        int maximumProduct = new Solution628().maximumProduct(nums);
        System.out.println("maximumProduct:" + maximumProduct);
    }
}
