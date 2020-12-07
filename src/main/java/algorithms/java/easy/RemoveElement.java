package algorithms.java.easy;

/**
 * #27. Remove Element
 * https://leetcode-cn.com/problems/remove-element/
 * 思路：通过变量i 重排数组，通过 numbers[j] == val 跳过指定元素
 * @author xiaobin
 */
public class RemoveElement {

    public static int removeElement(int[] numbers, int val) {
//        int i = 0;
//        int n = nums.length;
//        while (i < n) {
//            if(nums[i] == val) {
//                nums[i] = nums[n - 1];
//                n--;
//            } else {
//                i++;
//            }
//        }
//        return i;

        // 通过变量i 重排数组，通过 nums[j] == val 跳过指定元素，获取移除元素后的新数组
        int i = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == val) { continue; }
            numbers[i] = numbers[j];
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] numbers = {0,1,2,2,3,0,4,2};
        int newLength = RemoveElement.removeElement(numbers, 2);
        System.out.println("newLength=" + newLength);
    }
}
