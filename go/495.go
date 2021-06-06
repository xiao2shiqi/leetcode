package main

import "fmt"

/**
 * LC#495：提莫攻击
 * Link：https://leetcode-cn.com/problems/teemo-attacking/
 * 思路：考虑相邻两个攻击时间点 A[i] 和 A[i + 1] 以及中毒持续时间 t，如果 A[i] + t <= A[i + 1]，那么在第 i + 1 次攻击时，第 i 次攻击造成的中毒的持续时间已经结束，即持续时间为 t；如果 A[i] + t > A[i + 1]，那么在第 i + 1 次攻击时，第 i 次攻击的中毒仍然在持续，由于中毒状态不可叠加，因此持续时间为 A[i + 1] - A[i]
 */
func min(interval int, duration int) int {
	if interval < duration {
		return interval
	}
	return duration
}

func findPoisonedDuration(timeSeries []int, duration int) int {
	total := 0
	for i := 0; i < len(timeSeries)-1; i++ {
		total += min(timeSeries[i+1]-timeSeries[i], duration)
	}
	return total + duration
}

func main() {
	res := findPoisonedDuration([]int{1, 3, 5, 7, 9}, 3)
	fmt.Println("res >>>", res)
}
