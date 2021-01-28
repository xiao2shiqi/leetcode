/**
 * LC#35. Search Insert Position
 * link：https://leetcode-cn.com/problems/search-insert-position/
 * 题目非常简单，看到是有序数组，最先想到的就是 O(n) 的解法，CASE也能顺利通过，不过解答方式似乎不是最优，感觉这道题作者想考察的方向应该是给一个有序数组，通过二分查找达到 O(lon N) 的时间解答效率
 */
public class Solution35 {

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        int index = Solution35.searchInsert(nums, target);
        System.out.println("index = " + index);
    }
}
