/**
 * LC#88. Merge Sorted Array
 * https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class Solution88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //三指针替换
        int oneIndex = m - 1;
        int twoIndex = n - 1;
        int mergeIndex = m + n - 1;
        //从后往前，指针比较交换排序
        while (oneIndex >= 0 && twoIndex >= 0) {
            //比较排序
            if(nums1[oneIndex] > nums2[twoIndex]) {
                nums1[mergeIndex--] = nums1[oneIndex--];
            } else {
                nums1[mergeIndex--] = nums2[twoIndex--];
            }
        }
        while (twoIndex >= 0) {
            nums1[mergeIndex--] = nums2[twoIndex--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        Solution88 m = new Solution88();
        m.merge(nums1, 3, nums2, 3);
    }
}