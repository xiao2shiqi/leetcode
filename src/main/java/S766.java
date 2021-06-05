
/**
 * LC#766 Toeplitz Matrix
 * Link：https://leetcode-cn.com/problems/toeplitz-matrix/
 * 思路：从二维数组的第二层开始嵌套遍历，逐个 index - 1 级数组匹配元素
 */
public class S766 {

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 1; i < m; i++) {
            // 从第二层数组开始判断
            for (int j = 1; j < n; j++) {
                // 对比上一层 index -1 的元素，不匹配返回 false
                if (matrix[i][j] != matrix[i -1][j -1]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {5,1,2,3}, {9,5,1,2}};
        boolean res = isToeplitzMatrix(matrix);
        System.out.println("res :" + res);
    }
}
