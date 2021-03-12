package main

import "fmt"

/**
 * LC#155 Min Stack
 * Link：https://leetcode-cn.com/problems/min-stack/
 * 思路1：刚开始最简单是用使用数组实现栈（时间复杂度是在太高）
 * 思路2：使用双端队列模拟栈实现，1个队列维护数据进出，1个队列进队时维护最小元素（最优解）
 * 备注：思路和 java 相同，但 go 没有 queue 结构，使用双 slice + 维护一个int l指针解决
 */
type MinStack struct {
	// 2个数组
	elements, min []int
	l             int
}

func Constructor() MinStack {
	// 初始化构造函数，3个参数
	return MinStack{make([]int, 0), make([]int, 0), 0}
}

func (this *MinStack) Push(x int) {
	this.elements = append(this.elements, x)
	if this.l == 0 {
		this.min = append(this.min, x)
	} else {
		min := this.GetMin()
		if x < min {
			this.min = append(this.min, x)
		} else {
			this.min = append(this.min, min)
		}
	}
	this.l++
}

func (this *MinStack) Pop() {
	this.l--
	this.min = this.min[:this.l]
	this.elements = this.elements[:this.l]
}

func (this *MinStack) Top() int {
	return this.elements[this.l-1]
}

func (this *MinStack) GetMin() int {
	return this.min[this.l-1]
}

func main() {

	obj := Constructor()
	obj.Push(-2)
	obj.Push(0)
	obj.Push(-3)
	fmt.Println("getMin:", obj.GetMin())
	obj.Pop()
	fmt.Println("top:", obj.Top())
	fmt.Println("getMin:", obj.GetMin())
}
