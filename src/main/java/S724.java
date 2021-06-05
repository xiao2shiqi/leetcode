/**
 * LC#724：Find Pivot Index
 * Link：https://leetcode-cn.com/problems/find-pivot-index/
 * 思路：先求总和，再左求和*2+中心索引值 = 总和
 * @author Phoenix on 2021/5/9.
 */
public class S724 {

  public static int pivotIndex(int[] nums) {
    int arrayTotal = 0;
    for (int num : nums) {
      arrayTotal += num;
    }
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (sum * 2 + nums[i] == arrayTotal) {
        return i;
      }
      sum += nums[i];
    }
    return -1;
  }


  public static void main(String[] args) {
    int[] nums = {1, 7, 3, 6, 5, 6};
    int res = pivotIndex(nums);
    System.out.println("res:" + res);
  }

}
