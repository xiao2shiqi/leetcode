package main

import "fmt"

/**
 * LC#1：Two Sum 两数之和
 * https://leetcode-cn.com/problems/two-sum/
 * 思路1：2次哈希求解：将数组放入散列表，遍历散列表，通过target-key得出匹配数组，并且判断非自身元素，返回数组，时间复杂度 O（n）
 * 思路2[runtime beats（最优解）]：1次哈希求解：在遍历 num 数组，如果哈希表不包含 target - num[i] ，则将 num[i], i 放入哈希表，如果包含则直接返回 [hash[num[i], i]] 下标
 */
 func twoSum(nums []int, target int) []int {
	hashMap := map[int]int{}
	for i := 0; i < len(nums); i++ {
		p, ok := hashMap[target - nums[i]]
		if ok {
			return []int{p, i}
		}
		hashMap[nums[i]] = i
	}
	return nil
 }

func main() {
	// 声明 slice 
	nums := []int{2, 7, 11, 15}
	target := 9
	p := twoSum(nums, target)
	fmt.Println("p value:", p)
}