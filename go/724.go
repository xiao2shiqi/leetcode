package main

import "fmt"

/**
 * LC#724：Find Pivot Index
 * Link：https://leetcode-cn.com/problems/find-pivot-index/
 * 思路：先求总和，再左求和*2+中心索引值 = 总和
 */
func pivotIndex(nums []int) int {
	// 数组求和
	arrayTotal := 0
	for _, v := range nums {
		arrayTotal += v
	}
	sum := 0
	for i, v := range nums {
		if sum*2+v == arrayTotal {
			return i
		}
		sum += v
	}
	return -1
}

func main() {

	// 计算公式
	nums := []int{1, 7, 3, 6, 5, 6}
	res := pivotIndex(nums)
	fmt.Println("res:", res)
}
