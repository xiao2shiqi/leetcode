import java.util.Arrays;

/**
 * LC#IQ10.01：合并排序数组
 * Link: https://leetcode-cn.com/problems/sorted-merge-lcci/
 * 思路1：合并后排序 （效率低）
 * 思路2：使用 k 从尾部开始往头插入元素（最优）
 */
public class IQ1001 {

    public static void merge(int[] A, int m, int[] B, int n) {
        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] < B[j]) {
                A[k--] = B[j--];
            } else {
                A[k--] = A[i--];
            }
        }
        while (j >= 0) {  A[k--] = B[j--]; }
    }

    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};
        int[] nums1 = {0};
        int[] nums2 = {1};
        merge(nums1, 0, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }
}
