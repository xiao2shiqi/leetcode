package main

import "fmt"

/**
 * LC#992:Sort Array By Parity II
 * Link：https://leetcode-cn.com/problems/sort-array-by-parity-ii/
 * Method：DP 双指针
 * Remark：比官方的 O(n2) 解法效率还要慢上不少，不知道为什么，初始化 slice 也踩坑，没有初始化 slice len 还不能直接使用下标
 */
func sortArrayByParityII(nums []int) []int {
	res := make([]int, len(nums))
	j, o := 1, 0
	for _, e := range nums {
		if e%2 == 0 {
			res[o] = e
			o += 2
		} else {
			res[j] = e
			j += 2
		}
	}
	return res
}

func main() {

	nums := []int{4, 2, 5, 7}
	res := sortArrayByParityII(nums)
	fmt.Println(res)

}
