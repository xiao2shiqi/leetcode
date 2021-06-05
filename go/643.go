package main

import (
	"fmt"
)

/**
 * LC#643  Maximum Average Subarray I
 * Link：https://leetcode-cn.com/problems/maximum-average-subarray-i/
 * 思路：这道理作者要考察的知识点:滑动窗口来统计连续数组的最大值，减去滑出元素，加上滑入元素，得到当前连续序列，公式：sum = sum - nums[i-k] + nums[i]
 */
func findMaxAverage(nums []int, k int) float64 {
	sum := 0
	n := len(nums)
	for i := 0; i < k; i++ {
		sum += nums[i]
	}
	maxSum := sum
	for i := k; i < n; i++ {
		sum = sum - nums[i-k] + nums[i]
		if sum > maxSum {
			maxSum = sum
		}
	}
	return float64(maxSum) / float64(k)
}

func main() {
	nums := []int{1, 12, -5, -6, 50, 3}
	k := 4
	fmt.Println(nums)
	res := findMaxAverage(nums, k)
	fmt.Println("res:", res)
}
