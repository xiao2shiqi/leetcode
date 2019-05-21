package algorithms.java.easy;

/**
 * LC#169 Majority Element
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int length = nums.length;
        int count = 1;
        int maj = nums[0];
        for (int i = 1; i < length; i++) {
            if(maj == nums[i]) {
                count++;
            } else {
                count--;
                if(count == 0) {
                    maj = nums[i + 1];
                }
            }
        }
        return maj;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int result = majorityElement(nums);
        System.out.println("result > " + result);
    }
}