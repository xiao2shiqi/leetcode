import java.util.Arrays;

/**
 * LC#566 Reshape the Matrix
 * Link: https://leetcode-cn.com/problems/reshape-the-matrix/
 * 思路：判断 m * n != r * c 输出原矩阵，重塑矩阵可以将整数 xx 映射回其在矩阵中的下标，即 i=x/n,  j=x%n
 */
public class Solution566 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;

        if (m * n != r * c) {
            return nums;
        }
        
        int[][] ans = new int[r][c];
        for (int x = 0; x < m * n; x++) {
            ans[x/c][x%c] = nums[x/n][x%n];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2},{3, 4}};
        int[][] matrixReshape = new Solution566().matrixReshape(nums, 1, 4);
        for(int[] ar : matrixReshape) {
            System.out.println(Arrays.toString(ar));
        }
    }
}
