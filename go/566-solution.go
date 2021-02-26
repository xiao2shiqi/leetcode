package main

import "fmt"

/**
 * LC#566 Reshape the Matrix
 * Link: https://leetcode-cn.com/problems/reshape-the-matrix/
 * 思路：判断 m * n != r * c 输出原矩阵，重塑矩阵可以将整数 xx 映射回其在矩阵中的下标，即 i=x/n,  j=x%n
 */
func matrixReshape(nums [][]int, r int, c int) [][]int {
    n, m := len(nums), len(nums[0])
    if n*m != r*c {
        return nums
    }
    ans := make([][]int, r)
    for i := range ans {
        ans[i] = make([]int, c)
    }
    for i := 0; i < n*m; i++ {
        ans[i/c][i%c] = nums[i/m][i%m]
    }
    return ans
}
