package main

import "fmt"

/**
 * LC#905. Sort Array By Parity
 * Link：https://leetcode-cn.com/problems/sort-array-by-parity/
 * 思路1：1次遍历输出，维护头尾指针s,m 分别根据奇数偶数类型选择从头尾插入
 */
func sortArrayByParity(nums []int) []int {
	i, j := 0, len(nums)-1
	for i < j {
		fmt.Println("i:", i, "j:", j)
		if nums[i]%2 > nums[j]%2 {
			nums[i], nums[j] = nums[j], nums[i]
		}
		if nums[i]%2 == 0 {
			i++
		}
		if nums[j]%2 == 1 {
			j--
		}
	}
	return nums
}

func main() {
	input := []int{3, 1, 2, 4}
	res := sortArrayByParity(input)
	fmt.Println(res)
}
