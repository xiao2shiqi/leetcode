package main

import "fmt"

/**
 * LC#674：Longest Continuous Increasing Subsequence
 * Link：https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/
 * 思路：使用贪心策略获得尽可能长的子序列，使用循环 nums 计算递增序列，start 计算统计开始的下标位，因为 nums[i] <= nums[i -1] 时就不可能存在连续递增序列，所有将 start = i，最终使用 ans 保存当前最长的递增徐磊
 */
func findLengthOfLCIS(nums []int) int {
	ans, start := 0, 0
	for i, e := range nums {
		if i > 0 && e <= nums[i-1] {
			start = i
		}
		curTol := i - start + 1
		if curTol > ans {
			ans = curTol
		}
	}
	return ans
}

func main() {
	nums := []int{1, 3, 5, 4, 2, 3, 4, 5}
	// nums := []int{1, 3, 5, 4, 7}
	res := findLengthOfLCIS(nums)
	fmt.Println("res >>", res)
}
