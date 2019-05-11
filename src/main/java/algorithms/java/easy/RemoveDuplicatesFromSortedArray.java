package algorithms.java.easy;

/**
 * #26: Remove Duplicates from Sorted Array
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * 思路：
 * 1 双指针记录：j移动指针，i记录指针
 * 2 当num[j] > num[i] 则代表有序，i++，i移动到nums[j]
 * 3 以此类推
 */
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        //双指针统计，时间复杂度O(n);
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] > nums[i]){
                i++;
                nums[i] = nums[j];  //避免j后面的重复值导致重复统计
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,5};
        int result = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        System.out.println("numsLength:" + result);
        String haystack = "aaaaa", needle = "bba";
        System.out.println("index " + haystack.indexOf(needle));
    }
}