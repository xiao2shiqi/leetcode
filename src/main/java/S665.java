/**
 * LC#665：Non-decreasing Array
 * Link:https://leetcode-cn.com/problems/non-decreasing-array/
 * 备注：非递减数列的： 对于数组中任意的 i (0 <= i <= n-2)，总满足 nums[i] <= nums[i + 1]
 * 思路：这道题比较难理解，就是保证数组整体是一个非递减数列即可，循环 + 逻辑判断解决
 */
public class S665 {

    public static boolean checkPossibility(int[] nums) {
        int n = nums.length, cnt = 0;
        for(int i = 0; i < n -1; i++) {
            int x = nums[i], y = nums[i + 1];
            // 非递减数不进入逻辑判断
            if (x > y) {
                cnt++;
                // 如果非递减数出现 2次，返回 false
                if (cnt > 1) return false;
                if (i > 0 && y < nums[i - 1]) {
                    nums[i + 1] = x;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 3};
//        int[] nums = {4, 2, 1};
        boolean res = checkPossibility(nums);
        System.out.println("res :" + res);
    }
}
