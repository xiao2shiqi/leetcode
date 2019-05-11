package algorithms.java.easy;

/**
 * #27. Remove Element
 * https://leetcode-cn.com/problems/remove-element/
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if(nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int newLength = RemoveElement.removeElement(nums, 3);
        System.out.println("newLength =" + newLength);

    }
}
