package main

import (
	"fmt"
)

/**
 * LC#977：Squares of a Sorted Array
 * Link：https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 * Method 1：After calculating the square of the array, sort it
 * Method 2：Double Pointer
 * Remark：Method 2 双指针的精髓在于利用的数组已有的顺序
 */
func sortedSquares(nums []int) []int {
	n := len(nums)
	ans := make([]int, n)
	i, j, pos := 0, n-1, n-1
	for i <= j {
		sis := nums[i] * nums[i]
		eis := nums[j] * nums[j]
		if sis > eis {
			ans[pos] = sis
			i++
		} else {
			ans[pos] = eis
			j--
		}
		pos--
	}
	return ans
}

func main() {
	intList := []int{-4, -1, 0, 3, 10}
	res := sortedSquares(intList)
	fmt.Println(res)
}
