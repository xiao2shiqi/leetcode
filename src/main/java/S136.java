/**
 * LC#136 Single Number
 * Link：https://leetcode-cn.com/problems/single-number/
 *
 */
public class S136 {

    //线性时间复杂度，不使用额外空间
    public static int singleNumber(int[] nums) {
        if(nums.length < 1) return 0;
        int result = nums[0];
        //implement it without using extra memory
        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println("singleNumber > " + singleNumber(nums));
    }
}
