package main

import "fmt"

/**
 * LC#263: Ugly Number
 * Link：https://leetcode-cn.com/problems/ugly-number/
 * 思路：对 n 反复除以 2,3,5 直到 n 不再包含质数，剩下的数为1，则是丑数
 */
func isUgly(n int) bool {
	if n <= 0 {
		return false
	}
	factors := []int{2, 3, 5}
	for _, f := range factors {
		for n%f == 0 {
			n /= f
		}
	}
	return n == 1
}

func main() {
	n := 1
	res := isUgly(n)
	fmt.Println("res:", res)
}
