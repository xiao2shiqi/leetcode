package algorithms.java.easy;

/**
 * leetcode #35. Search Insert Position
 * link：https://leetcode-cn.com/problems/search-insert-position/
 */
public class SearchInsertPosition {

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
        int index = SearchInsertPosition.searchInsert(nums, target);
        System.out.println("index = " + index);
    }
}
