package main

import "fmt"

/**
 * LC#203 移除链表元素 Remove Linked List Elements
 * Link：https://leetcode-cn.com/problems/remove-linked-list-elements/
 * 思路1（optimum solution 最优解）：初始化一个 sentinel 遍历检查链表 head 链表，判断 tmp.val == val 就放弃当前引用，指向下一个引用 简单粗暴。从官方答案来看这应该也是最优解了
 */
type ListNode struct {
	Val  int
	Next *ListNode
}

func removeElements(head *ListNode, val int) *ListNode {
	sentinel := &ListNode{0, head}
	for tmp := sentinel; tmp.Next != nil; {
		if tmp.Next.Val == val {
			tmp.Next = tmp.Next.Next
		} else {
			tmp = tmp.Next
		}
	}
	return sentinel.Next
}

func main() {

	// build a simple linked
	n7 := ListNode{6, nil}
	n6 := ListNode{5, &n7}
	n5 := ListNode{4, &n6}
	n4 := ListNode{3, &n5}
	n3 := ListNode{6, &n4}
	n2 := ListNode{2, &n3}
	n1 := ListNode{1, &n2}
	cur := removeElements(&n1, 6)

	// Output Linked ...
	for cur != nil {
		fmt.Printf("cur %v  , val %d \n", cur, cur.Val)
		cur = cur.Next
	}
}
