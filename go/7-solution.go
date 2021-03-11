package main

import (
	"fmt"
	"math"
)

/**
 * LC#7：ReverseInteger 整数反转
 * https://leetcode-cn.com/problems/reverse-integer/
 * 思路1（runtime beats 最优解）：通过%10将整数从尾数弹出放入r中，x弹完=0时，返回r（判断溢出）
 */

func reverse(x int) int {
	var r int // zero value
	for x != 0 {
		pop := x % 10
		x = x / 10
		r = r*10 + pop
	}
	if r > 1<<31-1 || r < -(1<<31) {
		return 0
	}
	return r
}

func main() {

	x := 123
	res := reverse(x)
	fmt.Println("res:", res)
	fmt.Println("2^31", 2*31)
	fmt.Println(math.Pow(2, 31)) //x的y次方

}
