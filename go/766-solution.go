package main

import "fmt"

/**
 * LC#766 Toeplitz Matrix
 * Link：https://leetcode-cn.com/problems/toeplitz-matrix/
 * 思路：从二维数组的第二层开始嵌套遍历，逐个 index - 1 级数组匹配元素
 */
func isToeplitzMatrix(matrix [][]int) bool {
	m, n := len(matrix), len(matrix[0])
	for i := 1; i < m; i++ {
		// 从第二层数组开始判断
		for j := 1; j < n; j++ {
			// 对比上一层 index -1 的元素，不匹配返回 false
			if matrix[i][j] != matrix[i-1][j-1] {
				return false
			}
		}
	}
	return true
}

func main() {
	// matrix := [][]int{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}
	// matrix = [[1,2],[2,2]]
	matrix := [][]int{{1, 2}, {2, 2}}
	res := isToeplitzMatrix(matrix)
	fmt.Println("res:", res)
}
