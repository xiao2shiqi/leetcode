package main

import "fmt"

/**
 * LC#1550: Three Consecutive Odds
 * Link：https://leetcode-cn.com/problems/three-consecutive-odds/
 * 思路：送分题，用一个计数器统计就行了，没什么思路。。
 **/
func threeConsecutiveOdds(arr []int) bool {
	if len(arr) == 0 {
		return false
	}
	counter := 0
	for _, v := range arr {
		if v%2 == 0 {
			counter = 0
		} else {
			counter += 1
			if counter >= 3 {
				return true
			}
		}
	}
	return false
}

func main() {
	arr := []int{1, 2, 34, 3, 4, 5, 7, 23, 12}
	res := threeConsecutiveOdds(arr)
	fmt.Println("res:", res)
}
