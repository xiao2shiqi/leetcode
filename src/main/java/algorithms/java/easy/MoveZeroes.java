package algorithms.java.easy;

/**
 * LC#283 Move Zeroes 移动零
 * Link：https://leetcode-cn.com/problems/move-zeroes/
 * 思路1：思路很简单通过指针i，将所有非0元素向前移动，最后将 指针i...数组.length 区间全部填充零，线性时间复杂度，不使用额外的空间，Java beats 100%
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (num == 0) continue;
            nums[i] = num;
            i++;
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] input = {0,1,0,3,12};
        MoveZeroes.moveZeroes(input);
    }
}
