import java.util.Arrays;

/**
 * LC#561 数组拆分 Array Partition I
 * Link：https://leetcode-cn.com/problems/array-partition-i/
 * 思路：对数组排序后，直接计算奇数下标即可
 */
public class S561 {
    
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i=i+2){
            sum+=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        int arrayPairSum = new S561().arrayPairSum(nums);
        System.out.println("arrayPairSum:" + arrayPairSum);
    }

}
